import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	String str;
	int s,e;
	String sc;
	String ms;
	int num;
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public boolean db(int g){
		int m = 0;
		int f = 0;
		for(int i = g;i < str.length();i++){
			switch(str.charAt(i)){
			case '[':
				if(m > 0){
					s = i-1;
					f++;
				}
				m++;
				break;
			case ']':
				if(m < 0){
					e = i+1;
					if(f > 0)
						return true;
				}
				m--;
				break;
			default:
				m = 0;
				break;
			}
		}
		return false;
	}
	
	public void f(){
		sc = "";
		int k,b = 0;
		e = 0;
		num = 0;
		char c;
		while(db(e)){
			list.clear();
			ms = str.substring(s,e);
/*			String[] si = ms.substring(2,ms.length()-2).split("\\]\\[");
			for(int i = 0;i < si.length;i++){
				list.add(Integer.valueOf(si[i]));
			}
			Collections.sort(list);
			k = 0;
			for(int i = 0;i < list.size()/2+1;i++){
				k += list.get(i);
			}
			sc = sc + str.substring(s,m.start()) + "[" + k + "]";
			s = m.end();*/
			for(int i = 0;i < ms.length();i++){
				c = ms.charAt(i);
				if(0 <= c-'0' && c-'0' <= 9){
					num = 10*num + (c-'0');
				}
				else{
					if(num > 0){
						list.add(num);
						num = 0;
					}
				}
			}
			Collections.sort(list);
			k = 0;
			for(int i = 0;i < list.size()/2+1;i++){
				k += list.get(i);
			}
			sc = sc + str.substring(b,s) + "[" + k + "]";
			b = e;
		}
		sc = sc + str.substring(b,str.length());
		str = sc;
	}
	
	public void fs(){
	/*	int s = 0;
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
		str = sc;*/
		sc = "";
		char c;
		num = 0;
		for(int i = 0;i < str.length();i++){
			c = str.charAt(i);
			if(0 <= c-'0' && c-'0' <= 9){
				num = 10*num + (c-'0');
			}
			else{
				if(num > 0){
					sc = sc + (num/2+1);
					num = 0;
				}
				sc = sc + c;
			}
		}
		str = sc;
	}
	
	public static void main(String[] args) {
		int n;
		Main m = new Main();
		Scanner in = new Scanner(System.in);
		for(n = Integer.valueOf(in.nextLine());n > 0;n--){
			m.str = in.nextLine();
			m.fs();
			while(m.str.charAt(1) == '[')
				m.f();
			System.out.println(m.str.substring(1,m.str.length()-1));
		}
	}

}