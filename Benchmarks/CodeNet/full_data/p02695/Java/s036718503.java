import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m  = sc.nextInt();
    int n  = sc.nextInt();
    int q  = sc.nextInt();
    int[] a = new int[q];
    int[] b = new int[q];
    int[] c = new int[q];
    int[] d = new int[q];
    int max_score = 0;

    for(int i=0; i<q; i++){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
      c[i] = sc.nextInt();
      d[i] = sc.nextInt();
    }

    for(int i=0; i<(1<<n+m-1);i++){
      //System.out.println(i);
      int[] bitbit = new int[m];
      int bit_count = 0;
      int ball_number = 1;
      int g = 0;

      for(int j=0; j<n+m-1; j++){
        if((1&i>>j)==1){
          bit_count += 1;
        }
      }

      if(bit_count==m){
        for(int j=0; j<n+m-1; j++){
          if((1&i>>j)==1){
            bitbit[g] = ball_number;
            //System.out.println("NONO");
            g += 1;
          }else{
            ball_number += 1;
            //System.out.println("**");
          }
        }
         // for(int j:bitbit){
         //   System.out.print(j);
         // }


        int score = 0;
        for(int j=0; j<q; j++){
          if(bitbit[b[j]-1]-bitbit[a[j]-1] == c[j]){
            score += d[j];

          }
        }
        if(score>max_score){
          max_score = score;
        }

      }


      //System.out.println(i + ":" + bit_count);
      //System.out.println("max:"+max_score);

    }
      System.out.println(max_score);

  }
}