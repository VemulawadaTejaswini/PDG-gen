import java.util.Scanner;
public class Main {
   public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          int A = sc.nextInt();
          int B = sc.nextInt();
          int C = sc.nextInt();
          int count = 0;

          while(A/2 != 0 && B/2 != 0 && C/2 != 0){
        	  int Ab = A/2;
        	  int Bb = B/2;
        	  int Cb = C/2;
        	  A = 0;
        	  B = 0;
        	  C = 0;
        	  A += Bb + Cb;
        	  B += Ab + Cb;
        	  C += Ab + Bb;
        	  count++;
              	if(A == B && A == C){
              		count = -1;
              		break;
              	}
              }
          System.out.println(count);
          }
}