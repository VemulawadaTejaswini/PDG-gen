import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ2007();
	}
	class AOJ2007{
		int n;
		int[] d={10,50,100,500};
		AOJ2007(){
			int cnt=0;
			while(sc.hasNext()){
				n=sc.nextInt();
				if(n==0)	break;
				if(cnt++>0)	System.out.println();
				solve();
			}
		}
		void solve(){
			int[] h=new int[4];
			int sum=0;
			for(int i=0; i<4; ++i){
				h[i]=sc.nextInt();
				sum+=h[i];
			}
			
			int ans=100;
			int[] o=new int[4];
			for(int i=0; i<=h[0]; ++i)for(int j=0; j<=h[1]; ++j)for(int k=0; k<=h[2]; ++k)for(int l=0; l<=h[3]; ++l){
				int[] tmp={i,j,k,l};
//				System.out.println("A"+Arrays.toString(tmp));
				int ret=solve2( tmp );
				if(ret>=0 && ans > sum-(i+j+k+l)+ret){
					o[0]=i;	o[1]=j; o[2]=k; o[3]=l;
					ans=(sum-(i+j+k+l)+ret);
//					System.out.println("B"+(sum-(i+j+k+l)));
				}
//				System.out.println("ret"+ret+" ans"+ans);
			}
			
			for(int i=0; i<4; ++i){
				if(o[i]>0){
					System.out.println(d[i]+" "+o[i]);
				}
			}
			
		}
		int solve2(int[] s){
			int sum=0;
			for(int i=0; i<4; ++i)sum+=s[i]*d[i];
			int diff=sum-n;
//			System.out.println("sum"+sum+" diff"+diff);
			if(diff<0)	return -1;
			int[] t=new int[4];
			for(int i=3; i>=0; --i){
				while(diff>=d[i]){
					diff-=d[i];
					++t[i];
				}
			}
			
			int ret=0;
			for(int i=0; i<4; ++i){
				if(s[i]>0 && t[i]>0)	return -1;
				ret+=t[i];
			}
//			System.out.println("R"+Arrays.toString(t));
			return ret;
		}
	}
}