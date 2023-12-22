import java.util.*;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long ts=26;
		int count=0;
		while(n-ts>0){
			count++;
			n-=ts;
			ts*=26;
		}
		if(count==0){
			System.out.println((char)('a'-1+n));
			return;
		}
		StringBuilder ans=new StringBuilder();
		ts/=26;
		boolean hu=false;
		for(int i=0; i<count+1; i++){
			if(n/ts>0){
				ans.append((char)('a'+n/ts));
				hu=true;
				n%=ts;
			}else{
				ans.append("a");
			}
			ts/=26;
			if(ts==1){
				if(hu){
					ans.append((char)('a'+n));
				}else{
					ans.append((char)('a'+n-1));
				}
				break;
			}
		}
		System.out.println(ans);
	}
}
