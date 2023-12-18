import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long A[]=new long[N];
		//System.out.println((byte)6);
		for(int i=0;i<N;i++) {
			A[i]=sc.nextLong();
		}
		int count=N;
		for(int i=0;i<N-1;i++) {
			long sum1=A[i];
			long sum2=A[i];
			for(int j=i+1;j<N;j++) {
				sum1+=A[j];
				sum2=xor(sum2,A[j]);
				//System.out.println(i+","+j);
				if(sum1==sum2) {
					count++;
					//System.out.println(i+" , "+j);
				}else {
					break;
				}
			}
		}
		System.out.println(count);
	}
	static Long xor(long a,long b) {
		//Boolean[] A=new Boolean[20];
		//Boolean[] B=new Boolean[20];
		Boolean[] C=new Boolean[20];
		Long c=0L;
		for(int i=0;i<20;i++) {
			Boolean A=a%2==1;
			a=a/2;
			Boolean B=b%2==1;
			b/=2;
			C[i]=A!=B;
			if(C[i]) {
				c+=(long)Math.pow(2, i);
			}
			if(a==0&&b==0)break;
		}

		//=(byte)a;
		return c;
	}
}
