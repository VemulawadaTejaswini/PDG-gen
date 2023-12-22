import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
 
      int N = sc.nextInt();
      long D = sc.nextInt();
      int C = 0;
      long DD = D*D;
      for(int i=0;i<N;i++){
      	long X = sc.nextInt();
        long XX = X*X;
        long Y = sc.nextInt();
        long YY = Y*Y;
        
        if((XX+YY)<=(DD)){
        	C++;
        }
      }
      
	System.out.println(C);
      
    }
}