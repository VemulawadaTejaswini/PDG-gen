import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1153();
	}
	
	class AOJ1153{
		AOJ1153(){
			while(true){
				int n=sc.nextInt(),m=sc.nextInt();
				if((n|m)==0)	break;
				solve(n,m);
			}
		}
		void solve(int n,int m){
			int[] nn=new int[n],
					mm=new int[m];
			int ns=0, ms=0;
			for(int i=0; i<n; ++i){
				nn[i]=sc.nextInt();
				ns+=nn[i];
			}
			for(int i=0; i<m; ++i){
				mm[i]=sc.nextInt();
				ms+=mm[i];
			}
			Arrays.sort(nn);
			Arrays.sort(mm);
			int cand1=-1,cand2=-1,sum=Integer.MAX_VALUE/4;
			for(int i=0; i<n; ++i){
				for(int j=0; j<m; ++j){
					if(ns-nn[i]+mm[j] == ms-mm[j]+nn[i] && sum>nn[i]+mm[j]){
						cand1=i;
						cand2=j;
						sum=nn[i]+mm[j];
					}
				}
			}
			System.out.println(cand1<0? "-1" : nn[cand1]+" "+mm[cand2]);
		}
	}
	
	

}