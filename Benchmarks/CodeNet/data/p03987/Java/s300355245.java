import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[], min[];
		long ans = 0;
		a = new int[n];
		min = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
			min[i] = 200001;
		}
		sc.close();
		
		for(int i=0; i<n; i++){
			for(int j=0; j<=i; j++){
				if(min[j]>a[i]){
					min[j] = a[i];
				}
				ans += min[j];
			}
		}
		System.out.println(ans);
	}
}