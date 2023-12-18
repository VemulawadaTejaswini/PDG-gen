import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] a = new long[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextLong();
		}
		
		long res = 0;
		
		for(int i=0;i<n;i++) {
			int[] tmp = new int[20];
			for(int j=i;j<n;j++) {
				if(check(tmp,a[j])) res++;
				else break;
			}
		}
		
		System.out.println(res);
		in.close();
	}
	
	private static boolean check(int[] tmp,long a) {
		for(int i=0;i<20;i++) {
			tmp[i] += (a>>i)&1;
			if(tmp[i]==2) return false;
		}
		return true;
	}

}
