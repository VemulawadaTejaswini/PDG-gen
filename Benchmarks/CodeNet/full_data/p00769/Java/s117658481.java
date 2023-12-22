
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
	static String str;
	
	public static void f(){
		if(str.charAt(1) != '[')
			return;
		String sc = "";
		String ms;
		int k,s = 0;
		int d = 0;
		Pattern p = Pattern.compile("\\[(\\[\\d*\\])+\\]");
		Matcher m = p.matcher(str);
		while(m.find()){
			if(++d > 5)
				break;
			ArrayList<Integer> list = new ArrayList<Integer>();
			ms = m.group();
			String[] si = ms.substring(2,ms.length()-2).split("\\]\\[");
			for(int i = 0;i < si.length;i++){
				list.add(Integer.valueOf(si[i]));
			}
			Collections.sort(list);
			k = 0;
			for(int i = 0;i < list.size()/2+1;i++){
				k += list.get(i);
			}
			sc = sc + str.substring(s,m.start()) + "[" + k + "]";
			s = m.end();
		}
		sc = sc + str.substring(s,str.length());
		str = sc;
		f();
	}
	
	public static void fs(){
		int s = 0;
		String sc = "";
		String ms;
		Pattern p = Pattern.compile("\\[\\d*\\]");
		Matcher m = p.matcher(str);
		while(m.find()){
			ms = m.group();
			sc = sc + str.substring(s,m.start()) + "[" + (Integer.valueOf(ms.substring(1,ms.length()-1))/2+1) + "]";
			s = m.end();
		}
		sc = sc + str.substring(s,str.length());
		str = sc;
	}
	
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		for(n = Integer.valueOf(in.nextLine());n > 0;n--){
			str = in.nextLine();
			fs();
			f();
			System.out.println(str.substring(1,str.length()-1));
		}
	}

}