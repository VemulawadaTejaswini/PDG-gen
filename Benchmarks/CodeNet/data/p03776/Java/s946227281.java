import java.util.*;

class Kakaku{
	public long value;
	public int num;

	Kakaku(long a){
		value = a;
		num = 1;
	}

	public void add(){
		num++;
		return;
	}
}
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int p1 = 0;
		int p2 = 0;
		long[] ireko = new long[n];
		long sum = 0;
		double ans1;
		long ans2;

		for(int i=0; i<n; i++){
			ireko[i] = sc.nextLong();
		}
		Arrays.sort(ireko);
		Kakaku[] sorted = new Kakaku[n];
		sorted[0] = new Kakaku(ireko[n-1]);

		for(int i=n-2; i>=0; i--){
			if( sorted[p1].value == ireko[i] ){
				sorted[p1].add();
			}else{
				p1++;
				sorted[p1] = new Kakaku(ireko[i]);
			}
		} //sorted[0]~sorted[p1]までデータが入っている

		if( sorted[0].num >= a ){ //この場合のみbが用いられる
			ans1 = (double)sorted[0].value;
			ans2 = 0;
			for( int i=a; i<=Math.min(b,sorted[0].num); i++ ){
				ans2 += calcC(sorted[0].num,i);
			}
		}else{
			b = a;
			while(true){
				if( sorted[p2].num < b ){
					b -= sorted[p2].num;
					sum += sorted[p2].num * sorted[p2].value;
					p2++;
				}else{
					sum += b * sorted[p2].value;
					ans1 = (double)sum / (double)a;
					ans2 = calcC(sorted[p2].num,b);
					break;
				}
			}
		}
		System.out.println(ans1);
		System.out.println(ans2);
		return;
	}

	public static long calcC( int n, int m ){
		long c = 1;
		m = ( n-m < m ? n-m:m );
		for( int ns = n-m+1, ms=1; ms<= m; ns++, ms++ ){
			c *= ns;
			c /= ms;
		}
		return c;
	}

}