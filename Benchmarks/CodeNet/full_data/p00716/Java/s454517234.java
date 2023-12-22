import java.util.*;
public class P1135 {
	Scanner sc ;
	long si;
	int y;
	int t;
	Str[] type;
	void run() {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=0;i<n;i++) {
			si = sc.nextLong();
			y = sc.nextInt();
			t = sc.nextInt();
			type = new Str[t];
			for (int j=0;j<t;j++) 
				type[j] = new Str(sc.nextInt(),sc.nextDouble(),sc.nextInt());
			System.out.println(calc());
			
		}
	}
	
	long calc() {
		long sum;
		long maxSum = 0;
		long tmp;
		for (int j=0;j<t;j++) {
			sum = si;
			tmp = 0;
			for (int i=0;i<y;i++) {
				if (type[j].type == 0){
				tmp = (long) ( (sum) * type[j].r );
				sum = sum + tmp -type[j].cost;
				}else {
					sum = (long) ( sum - type[j].cost ) ;
					tmp += (long) ( (sum) * type[j].r);
				}
//				System.out.println(sum);
			}
			if (type[j].type == 1) sum = sum+tmp;
			maxSum = (sum<maxSum)? maxSum:sum;
		}
		System.out.println();
		return maxSum;
	}
	
	class Str {
		int type;
		double r;
		int cost;
		Str(int type, double r, int cost) {
			this.type = type;
			this.r = r;
			this.cost = cost;
		}
	}
	public static void main(String[] args) {
		new P1135().run();
	}
	
}