import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n]; 
		
		for(int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(a);
		
		for(int i = 0; i < n/2; ++i) {
			int tmp = a[i];
			a[i] = a[n-1-i];
			a[n-1-i] = tmp;			
		}
		
		System.out.print(a);
	}

}