import java.util.Scanner;

class Main {
	public static void main(String args[]){	

		Scanner scan = new Scanner(System.in);

		int n;
		while(true){
			n = scan.nextInt();
			if(n == 0)break;
			double sum = 0;
			double ave = 0;
			double var = 0;
		
			int a[];
			a = new int[n];
	
			for(int i = 0;i < n;i++){
				a[i] = scan.nextInt();
			}
		
			for(int i = 0; i < n; i++){
				sum += a[i];
			}
		
			ave = sum / n;
		
			for(int i = 0; i < n; i++){
				var += Math.pow((a[i] - ave),2);
			}
		
			System.out.println(Math.sqrt(var/n));
		}
	}
	
}