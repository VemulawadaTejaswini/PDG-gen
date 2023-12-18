import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long[] a = new long[n];
		long s = 0;
		for (int i=0; i<n;i++){
			a[i] = sc.nextLong();
			s += (a[i] - i - 1);
		}

		long m = Math.floorDiv(s,n);
	
		long ans1 = 0;
		long ans2 = 0;
		for (int i=0; i<n;i++){
			ans1 += Math.abs(a[i] - m - 1 - i);
			ans2 += Math.abs(a[i] - m - i);
		}
		
		if ( ans1 < ans2){
			System.out.println(ans1);
		}else{
			System.out.println(ans2);
		}
		
	}

}
