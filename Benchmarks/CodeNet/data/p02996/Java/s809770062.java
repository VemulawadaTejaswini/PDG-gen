import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		P[] kk=new P[n];
		for(int i=0; i<n; i++){
			long a = sc.nextLong();
			long b = sc.nextLong();
			kk[i]=new P(a,b);
		}
		Arrays.sort(kk,Comparator.comparing(P::getB));
		long time=0;
		for(int i=0; i<n; i++){
			if(kk[i].a>kk[i].b-time){
				System.out.println("No");
				return;
			}
			time+=kk[i].a;
		}
		System.out.println("Yes");
	}
	static class P{
		long a;
		long b;
		public P(long a,long b){
			this.a=a;
			this.b=b;
		}
		public long getB(){
			return this.b;
		}
	}
}

