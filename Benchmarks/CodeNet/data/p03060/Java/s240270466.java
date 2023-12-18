import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []v = new int [n];
		int []c = new int [n];
		int []a = new int [n];
		
		for(int i = 0; i < n;i++) {
			v[i] = sc.nextInt();
		}
		for(int j = 0; j < n; j++) {
			c[j] = sc.nextInt();
			a[j] = v[j] - c[j];
		}		
		int ans = 0;
		for(int i = 0; i < n ; i++) {
			if (a[i] >= 0) {
				ans += a[i];
			}
				
		}
		System.out.println(ans);
	

	}

}
