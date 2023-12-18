import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    String S = sc.next();

    sc.close();

    char[] s = S.toCharArray();

    int[] fArr = new int[26];
    int[] bArr = new int[26];

    int max = 0;

    for (int i = 0; i <= N; i++) {
      
      int count = 0;
      Arrays.fill(fArr, 0);
      Arrays.fill(bArr, 0);

      for (int j = 0; j < N; j++){
        if (j < i) {
          fArr[(int)s[j] - 97]++;
        } else {
          bArr[(int)s[j] - 97]++;
        }
      }

      for (int j = 0; j < 26; j++) {

        if (fArr[j] != 0 && bArr[j] != 0) {
          count++;
        }

      }

      max = Math.max(max, count);

    }
    
    System.out.println(max);
    
  }

}