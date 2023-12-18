import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextLong();
		long zero=0;
		long plus=0;
		long ma=0;
		ArrayList<Long> p=new ArrayList<>();
		ArrayList<Long> mai=new ArrayList<>();
		for(int i=0; i<n; i++){
			long a=sc.nextLong();
			if(a>0){
				plus++;
				p.add(a);
			}else if(a<0){
				ma++;
				mai.add(a);
			}else{
				zero++;
			}
		}
		long l=-1000000000000000000L;
		long r=1000000000000000001L;
		long mz=ma*plus+((long)(n-1)*n/2-(n-zero)*(n-zero-1)/2);
		if(ma*plus>=k){
			r=-1;
		}else if(mz>=k){
			System.out.println(0);
			return;
		}else{
			l=0;
		}
		Collections.sort(p);
		Collections.sort(mai);
		while(r-l>1){
			long m=(r+l)/2;
			long count=(m>0)?mz*2:0;
			int start=0;
			for(int i=0; i<p.size(); i++){
				int in=0;
				if(m>0){
					in=bug(p,m/p.get(p.size()-1-i),start);
					if(in>=p.size()-i){
						count--;
					}
				}else{
					in=bug(mai,(m-p.get(i)+1)/p.get(i),start);
				}
				start=in;
				count+=in;
			}
			start=0;
			for(int i=0; i<mai.size(); i++){
				int in=0;
				if(m>0){
					in=mai.size()-bug(mai,(m/mai.get(mai.size()-1-i))-1,start);
					if(in>=i+1){
						count--;
					}
				}else{
					in=p.size()-bug(p,(m+1)/mai.get(i),start);
				}
				start=mai.size()-in;
				count+=in;
			}
			if(count/2<k){
				l=m;
			}else{
				r=m;
			}
		}
		System.out.println(r);
	}
	static int bug(ArrayList<Long> t,long s,int start){
		while(start<t.size() && t.get(start)<=s){
			start++;
		}
		return start;
	}
}
