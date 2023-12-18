import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		P[] kk=new P[n];
		for(int i=0; i<n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			kk[i]=new P(a,b);
		}
		Arrays.sort(kk,(t,y)->t.b-y.b);
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
		int a;
		int b;
		public P(int a,int b){
			this.a=a;
			this.b=b;
		}
	}
}

