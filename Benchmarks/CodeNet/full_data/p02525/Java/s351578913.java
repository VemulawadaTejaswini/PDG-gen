import java.util.Scanner;
	public class Main {
	public static void main(String[] args) {
	// ?¨??????\???????????????????????????????????????
	Scanner sc= new Scanner(System.in);
	double variance =0;
	while(true) {
		int n = sc.nextInt();
		if (n == 0) { break; }
		double[] scores = new double[n];
		for(int i= 0; i< scores.length; i++) {
				scores[i] = sc.nextInt();
			}
		double average = 0;
		double y = 0;
		for(int j=0;j<n;j++){
			y = y + scores[j];
			}double x =0;
		average = y/n;
		for(int k =0;k<n;k++){
				
				
			x = x + (scores[k]-average)*(scores[k]-average);
			}
			variance = x /n;
			System.out.println(Math.sqrt(variance));
		}	
	// ??? ?????????average??¨????????£variance????¨????????????????

	}
	}
	