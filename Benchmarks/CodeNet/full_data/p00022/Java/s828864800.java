import java.util.*;
import java.io.*;
public class Main {
	private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    private static int getInt() throws IOException{
    	int res=0;
    	boolean neg=false;
    	char ch=(char)br.read();
    	while(ch>'9'||ch<'0'){
    		if(ch=='-')
    			neg=!neg;
			try {ch=(char)br.read();}
			catch (Exception e) {e.printStackTrace();}
    	}
    	while(ch<='9'&&ch>='0'){
    		res=res*10+ch-'0';
    		try {ch=(char)br.read();}
			catch (Exception e) {e.printStackTrace();}
    	}
    	if(neg)return -1*res;
    	return res;
    }
	public static void main(String args[]) throws IOException{
		int n=getInt();
		while(n!=0){
			int sum=getInt();
			int ans=sum;
			for(int i=1;i<n;i++){
				int x=getInt();
				if(sum>0)sum+=x;
				else	sum=x;
				if(ans<sum)
					ans=sum;
			}
			n=getInt();
			System.out.println(ans);
		}
	}
}