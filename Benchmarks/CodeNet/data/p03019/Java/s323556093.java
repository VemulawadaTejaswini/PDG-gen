import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int x = sc.nextInt();
		long goal=0;
		long ans=0;
		th[] tt=new th[n];
		for(int i=0; i<n; i++){
			int b= sc.nextInt();
			int l=sc.nextInt();
			int u=sc.nextInt();
			tt[i]=new th(l,u,b);
			goal+=b*l;
		}
		Arrays.sort(tt,Comparator.comparing(th::getU).reversed());
		for(int i=0; i<n; i++){
			if((x-tt[i].b)*tt[i].u<goal-tt[i].b*tt[i].l){
				ans+=x;
				goal-=tt[i].b*tt[i].l+(x-tt[i].b)*tt[i].u;
			}else{
				goal-=tt[i].b*tt[i].l;
				goal+=tt[i].b*tt[i].u;
				ans+=goal/tt[i].u;
				if(goal%tt[i].u!=0){
					ans++;
				}
				break;
			}
		}
		System.out.println(ans);
	}
	static class th{
		public int l;
		public int u;
		public int b;
		th(int l,int u,int b){
			this.l=l;
			this.u=u;
			this.b=b;
		}
		public int getU(){
			return this.u;
		}
	}
}
