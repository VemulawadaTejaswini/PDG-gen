import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] a = new long[N+1];
		long[] b = new long[N+1];
		for( int i=1; i<N+1; i++ ){
			b[i] = sc.nextLong();
			a[i] = b[i];
		}
		long count1 = 0;
		long count2 = 0;
		long c = 0;
		long d = 0;      
		for( int i=1; i<=N; i++ ){
			for( int j=i-1; j>=0; j-- ){
				c += a[j];
            }              
				if( i%2!=0 && a[i]-c<=0 ){
					count1 += c - a[i] + 1;
					a[i] += c - a[i] + 1;
				}
				if( i%2==0 && a[i]-c>=0 ){
					count1 += a[i] - c + 1;
					a[i] -= a[i] - c + 1;
				}         
		}     
		for( int i=1; i<=N; i++ ){
			for( int j=i-1; j>=0; j-- ){
				d += b[j];
            }              
				if( i%2==0 && b[i]-d<=0 ){
					count2 += d - b[i] + 1;
					b[i] += d - b[i] + 1;
				}
				if( i%2!=0 && b[i]-d>=0 ){
					count2 += b[i] - d + 1;
					b[i] -= b[i] - d + 1;
				}           
		}      
		System.out.println(Math.min(count1,count2));
	}
}
