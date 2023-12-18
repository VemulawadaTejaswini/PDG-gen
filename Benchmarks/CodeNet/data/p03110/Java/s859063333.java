import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        Double X = 0.0;
	        String U = "no word";
	        Double ans = 0.0;
	        
		 	for (int i=0; i<N; i++){
		 		X = sc.nextDouble();
		 		U = sc.nextLine();

	        	if(U.equals(" BTC")){
	        		X = X * 380000.0;
	        	}
	        	ans = ans + X;
		 	}
	        System.out.println(ans);
	}
}