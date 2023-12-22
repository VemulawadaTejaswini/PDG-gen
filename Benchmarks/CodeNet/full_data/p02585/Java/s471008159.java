import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.MidiUnavailableException;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    long k = sc.nextInt();

    int[] p = new int[n+1];
    long[] c = new long[n+1];

    long roundScore = 0;

    for(int i=1; i<=n; i++){
      p[i] = sc.nextInt();
    }
    for(int i=1; i<=n; i++){
      c[i] = sc.nextInt();
      roundScore += c[i];
    }

    long[][] score = new long[n+1][n+1];

    // first time
    for(int i=1; i<=n; i++){
      score[i][1] = c[p[i]];
    }

    for(int i=1; i<=n; i++){
      for(int times = 2; times < n+1; times++){
        score[i][times] = score[i][times - 1] + c[p[p[i]]];
      }
    }

    long[] max = new long[n+1];
    for(int i = 1; i<=n; i++){
      max[i] = Long.MIN_VALUE;
    }

    if(roundScore <= 0){
      //k check required

      if(k >= n){
        for(int i=1; i<=n; i++){
          for(int times = 1; times < n+1; times++){
            max[i] = max[i] > score[i][times] ? max[i] : score[i][times];
          }
        }
      }else{
        for(int i=1; i<=n; i++){
          for(int times = 1; times < k+1; times++){
            max[i] = max[i] > score[i][times] ? max[i] : score[i][times];
          }
        }
      }
    }else{
      long set = k/n;
      long nokori = k - set * n;

      long[] plusMax = new long[n +1];

      for(int i=1; i<=n; i++){
        max[i] = set * roundScore;
        plusMax[i] = Long.MIN_VALUE;
      }

      for(int i=1; i<=n; i++){
        for(int times = 1; times < nokori+1; times++){
          plusMax[i] = plusMax[i] > score[i][times] ? plusMax[i] : score[i][times];
        }
      }

      for(int i=1; i<=n; i++){
        if(plusMax[i] > 0){
          max[i] = max[i] + plusMax[i];
        }
      }
    }

    long result = Long.MIN_VALUE;
    for(int i=1; i<=n; i++){
      result = result > max[i] ? result : max[i];
    }

    System.out.println(result);

    return;

  }
}