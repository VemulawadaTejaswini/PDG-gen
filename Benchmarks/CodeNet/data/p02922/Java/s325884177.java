import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in)
          
          int A = scan.nextInt();
          int B = scan.nextInt();
      	  int X = 0;
      
      	  while(0 < B){
            X += 1;
            B -= A;
          }  
          
      	  System.oout.println(X);

	}

}
