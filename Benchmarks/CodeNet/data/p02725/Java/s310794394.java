
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = Integer.parseInt(sc.next());
		
		int n = Integer.parseInt(sc.next());
		
		int []a = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
		
		}
	
		int max = 0;
		
		for(int i = 0 ;i < n-1 ;i++) {
			max = Math.max(max,a[i+1] - a[i]);
		}
		System.out.println(k - max);
	}		
	}
