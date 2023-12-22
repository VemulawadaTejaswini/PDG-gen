import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p, q, s;
		double sum, t, r;
		double max = -1;
		int n = sc.nextInt();
		for(int i=0;i<=n;i++){
			p = sc.nextInt();
			q = sc.nextInt();
			sum = 0;
			r = 0;
			for(int j=0;j<q;j++){
				s = sc.nextInt();
				t = sc.nextDouble();
				sum += s*t;
				r += t;
			}
			sum /= r;
			
			if(i==n){
				if(max-sum>0.0000001) System.out.println("YES");
				else System.out.println("NO");
			}else{
				max = Math.max(max, sum);
			}
		}
	}	
}