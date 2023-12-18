import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] x= new int[n];
		int [] y = new int[n];
		long[] h = new long[n];
		int t=0;
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
			h[i]=sc.nextInt();
			if(h[i]!=0) {
				t=i;
			}
		}
		long H=0;
		for(int i=0;i<=100;i++) {
			for(int j=0;j<=100;j++) {
				H=h[0]+Math.abs(x[0]-i)+Math.abs(y[0]-j);
				boolean ch=true;
				for(int k=0;k<n;k++) {
					if(h[k]!=Math.max(H-Math.abs(x[k]-i)-Math.abs(y[k]-j),0)) {
						ch=false;
						break;
					}
				}
				if(ch) {
					System.out.println(i+" "+j+" "+H);
				}
			}
		}


	}
}