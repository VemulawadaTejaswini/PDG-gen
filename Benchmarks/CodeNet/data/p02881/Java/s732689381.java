import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long sq=root(N)+1L;
		for(; sq>=1L; sq--) {
			if(N%sq==0) {
				if((N/sq) * sq == N ) {
					p(sq + N/sq - 2);
					System.exit(0);
				}
			}
		}
	}
	public static void p(Object o) {
		System.out.println(o);
	}
	static long root(long a) {

		int ketasu=0;
		long tmp=a;
		while(tmp>0) {
			ketasu++;
			tmp/=10L;
		}
		int constant=(ketasu+1)/2;	//よく使うので定数化
		if(ketasu>=1) {
			long[] suuji=new long[constant];
			tmp=a;
			for(int i=0; i<constant; i++) {
				suuji[constant-1-i]=a%100L;
				a/=100L;
			}
			long ans=0;
			long kai=0;
			long mae=0;
			if(constant<=1) {
				for(long i=10L; i>=0L; i--) {
					if(suuji[0]>=i*i) {
						return i;
					}
				}
			}
			else {
				for(long i=0L; i<constant; i++) {
					mae+=kai*2L;
					for(long j=9L; j>=0L; j--) {
						if((mae*10+j)*j<=suuji[(int)i]) {
							ans=ans*10+j;
							mae*=10;
							kai=j;
							if(i+1<constant) {
								suuji[(int)i+1]+=(suuji[(int)i]-(mae+j)*j)*100;
							}
							break;
						}
					}
				}
			}
			return ans;
		}
		else {
			return 0L;
		}
	}
}