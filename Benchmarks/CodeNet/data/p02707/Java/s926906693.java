import java.util.*;


public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for(int i = 0; i<n-1; i++) {
			int x = sc.nextInt();
			a[x]++;
		}
		for(int j= 1; j<=n ;j++){
			System.out.println(a[j]);
		}
		sc.close();		
	}

}