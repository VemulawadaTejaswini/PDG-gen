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
		mostsho = retsho(retsho(as,bs),cs);
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
		if(len1 == len2 && PatternMatches(sho,lon)){
			return sho;
		}
		for(i = 0;i < (lon.length() - sho.length() - 1);i++){
			buf = lon.substring(i,sho.length());
			if(PatternMatches(sho,buf)){
				return lon;
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
	public static String retsho(String str1,String str2){
		if(str1.length() > str2.length()){
			return str2;
		}else{
			return str1;
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
