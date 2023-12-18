import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String buf,as,bs,cs;
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		String ans,mostsho;
		as = MatchingStr(a,b);
		bs = MatchingStr(a,c);
		cs = MatchingStr(b,c);
		mostsho = retsho(a,b,as,a,c,bs);
		if(mostsho == as){
			mostsho = retsho(a,b,as,b,c,cs);
		}else{
			mostsho = retsho(a,c,bs,b,c,cs);
		}
		if(mostsho.equals(as)){
			buf = c;
		}else if(mostsho.equals(bs)){
			buf = b;
		}else{
			buf = a;
		}
		ans = MatchingStr(mostsho,buf);
		System.out.println(ans.length());
	}
	public static String MatchingStr(String str1,String str2){
		String lon,sho,lonhead,lontail;
		int len1 = str1.length();
		int len2 = str2.length();
		int i;
		String buf,head,tail;
		if(len1 > len2){
			lon = str1;
			sho = str2;
		}else{
			lon = str2;
			sho = str1;
		}
		for(i = 0;i < (lon.length() - sho.length() + 1);i++){
			buf = lon.substring(i,i + sho.length());
			if(PatternMatches(sho,buf)){
				if(lon.length() == sho.length() && lon.contains("?")){
					return sho;
				}else{
					return lon;
				}
			}
		}
		for(i = 0;i < sho.length() - 1;i++){
			head = sho.substring(i + 1,sho.length());
			tail = sho.substring(0,sho.length() - 1 - i);
			lonhead = lon.substring(0,sho.length() - 1 - i);
			lontail = lon.substring(lon.length() - sho.length() + 1 + i,lon.length());
			if(PatternMatches(lonhead,head)){
				buf = sho.substring(0,i + 1);
				return buf + lon;
			}else if(PatternMatches(tail,lontail)){
				buf = sho.substring(sho.length() - 1 - i,sho.length());
				return lon + buf;
			}
		}
		return lon + sho;
	}
	public static String retsho(String a1,String b1,String str1,String a2,String b2,String str2){
		int str1len = a1.length() + b1.length() - str1.length();
		int str2len = a2.length() + b2.length() - str2.length();
		if(str1len > str2len){
			return str1;
		}else{
			return str2;
		}
	} 
	public static boolean PatternMatches(String str1,String str2){
		for(int i = 0;i < str1.length();i++){
			if(str1.charAt(i) != str2.charAt(i) && str1.charAt(i) != '?' && str2.charAt(i) != '?'){
				return false;
			}
		}
		return true;
	}
}
