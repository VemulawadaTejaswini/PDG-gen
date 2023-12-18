import java.util.Scanner;
public class Main{
	
	static int step(int[] a,int b) {
		return a[b-1];
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		long k = stdIn.nextLong();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		if(k > (1e8)) {
			k = k % (int)1e9+7;
		}
		
		long cnt = 0;
		int index = 0;
		int b = 0;
		
		while(cnt < k) {
			b =step(a,step(a,a[0]));
			
			
			cnt++;
		}
		System.out.println(b);
		
		
		
		
		
		
		
	}

}
