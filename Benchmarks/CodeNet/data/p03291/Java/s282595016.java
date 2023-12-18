import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long[] as = new long[s.length()];
		long[] cs = new long[s.length()];
		long[] hleft = new long[s.length()];
		long[] hright = new long[s.length()];
		long[] pow = new long[s.length()+1];
		long MOD = 1000000007;
		as[0] = 0;
		for(int i=1;i<s.length();++i){
			as[i] += as[i-1];
			hleft[i] += hleft[i-1];
			char a = s.charAt(i-1);
			if(a=='A') as[i]++;
			if(a=='?') hleft[i]++;
		}
		cs[s.length()-1] = 0;
		for(int i=s.length()-2;i>=0;--i){
			cs[i] += cs[i+1];
			hright[i] += hright[i+1];
			char c = s.charAt(i+1);
			if(c=='C') cs[i]++;
			if(c=='?') hright[i]++;
		}
		pow[0] = 1;
		for(int i=1;i<s.length();++i){
			pow[i] = pow[i-1]*3;
			pow[i] %= MOD;
		}

		long ans = 0;
		for(int i=1;i<s.length()-1;++i){
			char b = s.charAt(i);
			if(b=='B'||b=='?'){
				long left = as[i] * pow[(int)hleft[i]];
				if(hleft[i]!=0) left += hleft[i] * pow[(int)hleft[i]-1];
				left %= MOD;
				long right = cs[i] * pow[(int)hright[i]];
				if(hright[i]!=0) right += hright[i] * pow[(int)hright[i]-1];
				right %= MOD;
				ans += left * right;
				ans %= MOD;
			}
		}

		System.out.println(ans);
		return;
	}
}