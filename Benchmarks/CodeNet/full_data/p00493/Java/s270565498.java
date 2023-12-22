import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BigInteger a=sc.nextBigInteger();
		BigInteger b=sc.nextBigInteger();
		BigInteger m=sc.nextBigInteger();
		int MOD=10000;
		int cnt=0;
		for(;a.compareTo(b)<=0;){
			String s = a.toString();
			if(zig(s)){
				cnt=(cnt+1)%MOD;
			}
			a=a.add(m);
		}
		System.out.println(cnt);
	}
	static boolean zig(String c){
		char[]s=c.toCharArray();
		if(s.length==1)return true;
		if(s.length==2){
			return s[0]!=s[1];
		}
		boolean migi=false;;
		if(s[0]<s[1]){
			migi=true;
		}
		else if(s[0]>s[1]){
			migi=false;
		}
		else if(s[0]==s[1]){
			return false;
		}
		for(int i=1;i<s.length-1;i++){
			if(s[i]==s[i+1])return false;
			if(migi){
				if(s[i]>s[i+1]){
					migi=false;
				}
				else{
					return false;
				}
			}
			else{
				if(s[i]<s[i+1]){
					migi=true;
				}
				else{
					return false;
				}
			}
		}
		return true;
	}
}