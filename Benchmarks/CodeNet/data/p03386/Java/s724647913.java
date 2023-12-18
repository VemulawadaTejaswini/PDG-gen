import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int H = C;
      int D = C;
      int F = 1;
      if(B-A<=C+1&&(A+B)%2==1){
        for(;B>=A;){
          System.out.println(A);
          A++;
        }
        return;
      }
      if(B-A<=C+2&&(A+B)%2==0){
        for(;B>=A;){
          System.out.println(A);
          A++;
        }
        return;
      }
      System.out.println(A);
      for(;H>1;H--){
        A++;
        System.out.println(A);
      }
      for(;F<=C;D--,F++){
        int kari = B-D+1;
      System.out.println(kari);
      }
   }
 }
