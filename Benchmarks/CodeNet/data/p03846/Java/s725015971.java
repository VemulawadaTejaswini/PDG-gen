import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		new Main().execute();
	}
	
	public void execute() {
		Scanner scanner = new Scanner(System.in);
		final int N = scanner.nextInt();
		final int MOD = 1000000007;
		int count = 0;
		
		int [] reports = new int[N];
		
		for (int i =0;i<N;i++) {
			reports[i] = scanner.nextInt();
		}
		Arrays.sort(reports);
		
		if(!validateReport(reports)) {
			System.out.println(count);
			scanner.close();
			return;
		}
		
		int ptn;
		count = 1;
		if( N>=2 && N%2 ==0) {
			 ptn = reports[reports.length-1] / 2 + 1;
		}else {
			 ptn = reports[reports.length-1] / 2 ; 
		}
		for (int i=0; i< ptn; i++) {
			count = (count *2) % MOD;
		}
		
		System.out.println(count);
		scanner.close();
		
	}
	
	private boolean validateReport(int [] rep) {
		int n = rep.length;
		
		if( n%2 ==0) {
			int val = 1;
			for ( int i = 0; i<rep.length; i++) {
				if(i>0 && i%2 ==0) {
					val +=2;
				}
				if(rep[i] != val) {
					return false;
				}
			}
		}
		else {
			int val = 0;
			for ( int i = 0; i<rep.length; i++) {
				if(i%2 !=0) {
					val +=2;
				}
				if(rep[i] != val) {
					return false;
				}
			}
		}
		return true;
	}
	
}
