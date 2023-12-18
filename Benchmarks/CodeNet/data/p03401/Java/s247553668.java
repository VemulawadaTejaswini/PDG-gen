import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n+2];
		a[0] = 0;
		a[n+1] = 0;
		for(int i=1; i<n+1; i++){
			a[i] = sc.nextInt();
		}
		int total = 0;	
		for(int i=1;i<=n+1; i++){
			total += Math.abs(a[i] - a[i-1]);
		}
		int sum = 0;
		for(int i=1; i<=n;i++){
			sum = total - Math.abs(a[i]-a[i-1]) - Math.abs(a[i+1]-a[i]) + Math.abs(a[i+1]-a[i-1]);
			System.out.println(sum);
		}
	}
}