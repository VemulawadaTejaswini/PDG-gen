import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		if (N<=0 || K<0 || K>2*Math.pow(10,5)){
			System.out.println(0);
		}
		else
		{
			int count = 0;
			if(K%2==0){
				int n = N/K;
				int m = N / (K / 2) - n;
				
				System.out.println(n*n*n +m*m*m);
			}
			else{
				int n = N/K;
				
				System.out.println(n*n*n );
				
			}
			
		}
		
	}

}