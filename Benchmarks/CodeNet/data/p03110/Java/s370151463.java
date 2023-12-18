import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
      	int N = input.nextInt();
      	long ans = 0;
      
     	for (int i = 0; i < N; i++) {
        	double X = input.nextDouble();
          	String U = input.next();
          	if (U.equals("JPY")) {
            	ans += X;
            } else {
            	ans += X * 380000.0;
            }
          	
        }
      	
      
      System.out.print(ans);

    }
}
