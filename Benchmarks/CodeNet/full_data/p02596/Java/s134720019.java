import java.util.*;
import java.io.PrintWriter;
public class Main {
	
	static PrintWriter out;
	static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner(System.in);
		out=new PrintWriter(System.out);
		
		int m=sc.nextInt();
		long k=7,ans=1;
		HashSet<Long> hs=new HashSet<>();
		hs.add(k);
		int flag=0;
		while(true) {
			if(k%m==0) {
				out.print(ans);
				break;
			}
			else {
				ans+=1;
				k*=10;
				k+=7;
				k%=m;
				if(hs.contains(k)) {
					flag=1;
					break;
				}
				else {
					hs.add(k);
				}
			}
		}
		
		if(flag==1) {
			out.print(-1);
		}
		sc.close();
		out.close();
		
	}
}
