import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		
		int minVal=scan.nextInt(), maxVal=minVal;
		long sum=minVal;

		for(int i=0; i<n-1; i++) {
			int val = scan.nextInt();
			
			if(minVal > val) minVal = val;
			
			if(maxVal < val) maxVal = val;
			
			sum += val;
		}
		
		System.out.println(minVal + " " + maxVal + " " + sum);

	}

}




