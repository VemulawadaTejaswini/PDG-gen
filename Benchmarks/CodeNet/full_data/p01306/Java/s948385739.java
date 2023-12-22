import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("yotta",24);
		map.put("zetta",21);
		map.put("exa",18);
		map.put("peta",15);
		map.put("tera",12);
		map.put("giga",9);
		map.put("mega",6);
		map.put("kilo",3);
		map.put("hecto",2);
		map.put("deca",1);
		map.put("deci",-1);
		map.put("centi",-2);
		map.put("milli",-3);
		map.put("micro",-6);
		map.put("nano",-9);
		map.put("pico",-12);
		map.put("femto",-15);
		map.put("ato",-18);
		map.put("zepto",-21);
		map.put("yocto",-24);

		while(n-- > 0){
			String s = sc.next();
			String a = sc.next();
			String b = null;
			if(!sc.hasNextDouble()){
				b = sc.next();
			}
			else{
				b = a;
				a = null;
			}

			int idx = 0;
			for(;s.charAt(idx)=='0' || s.charAt(idx)=='.';idx++);
			String ns = "" + s.charAt(idx++);
			if(idx < s.length()){
				ns += ".";
				for(;idx<s.length();idx++){
					char ch = s.charAt(idx);
					ns += ch == '.' ? "" : ch;
				}
			}

			int before = 0;
			for(;before<s.length() && s.charAt(before)!='.';before++);
			if(before == s.length()) before--;
			int after = 0;
			for(;after<ns.length() && ns.charAt(after)!='.';after++);
			if(after == ns.length()) after--;

			System.out.println(ns + " * 10^" + ((a==null ? 0 : map.get(a)) + (ns.length() - after) - (s.length() - before)) + " " + b);
		}
	}
}