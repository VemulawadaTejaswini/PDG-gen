import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int l = sc.nextInt();
		int []a = new int [n];
		
		for(int i = 0; i < n ; i++) {
			a[i] = l + i;
		}
		int min = 100;
		int sum = 0;
		
		for(int j = 0; j < n ; j++) {
			if(Math.abs(min) > Math.abs(a[j])) {
				min = a[j];
			    }
			sum += a[j];	
		}
		System.out.println((sum - min));
		
	}
}
