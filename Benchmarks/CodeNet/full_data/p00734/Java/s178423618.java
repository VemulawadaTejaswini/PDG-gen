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
			int i=0,j=0;
//			System.out.println("A:"+ns+" "+ms);
			while(true){
//				System.out.println("B:"+nn[i]+" "+mm[j]);
				if(ns-nn[i]+mm[j] == ms-mm[j]+nn[i]){
					System.out.println(nn[i]+" "+mm[j]);
					return;
				}else if(nn[i]<mm[j] && i+1<n)	++i;
				else if(j+1<m)	++j;
				else	break;
			}
			System.out.println(-1);
		}
	}
	
	

}