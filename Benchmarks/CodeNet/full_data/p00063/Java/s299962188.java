import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int ans=0;
		while(s.hasNext()){
			String b=s.next();
			boolean now=true;
			for(int i=0;i<b.length();i++){
				if(b.charAt(i)!=b.charAt(b.length()-1-i))now=false;
			}
			if(now)ans++;
		}
		System.out.println(ans);
	}
}