
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] a = new int[n];
		int sum = 0;
		for (int i=0;i<n;i++){
			a[i] = sc.nextInt();
			sum += a[i];
		}
		if (sum%n==0){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		
	}
}
