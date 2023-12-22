import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p, q;
		double sum, r;
		int[] s;
		double[] t;
		
		double max = -1;
		int n = sc.nextInt();
		for(int i=0;i<=n;i++){
			p = sc.nextInt();
			q = sc.nextInt();
			sum = 0;
			r = 0;
			s = new int[q];
			t = new double[q];
			for(int j=0;j<q;j++){
				s[j] = sc.nextInt();
				t[j] = sc.nextDouble();
				r += t[j];
			}
			for(int j=0;j<q;j++) sum += (s[j]*t[j])/r;

			if(i==n){
				if(max-sum>0.0000001) System.out.println("YES");
				else System.out.println("NO");
			}else{
				max = Math.max(max, sum);
			}
		}
	}	
}