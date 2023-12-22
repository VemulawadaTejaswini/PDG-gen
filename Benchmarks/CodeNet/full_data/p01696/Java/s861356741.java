import java.util.Scanner;

public class Main{
	public static char[] s;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			s = in.next().toCharArray();
			if(s[0] == '.') break;
			idx = 0;
			char[] res = cipher().toCharArray();
			for(int i=0; i<res.length; i++){
				if(res[i] == '?') res[i] = 'A';
			}
			System.out.println(String.valueOf(res));
		}
	}
	
	public static int idx;
	public static String cipher(){
		if(idx == s.length || s[idx] == ']') return "";
		String next;
		String res = "";
		while((next = string()).length() > 0){
			res += next;
		}
		return res;
	}
	
	public static String string(){
		if(idx == s.length || s[idx] == ']') return "";
		if(s[idx] == '['){
			idx++;
			char[] tmp = cipher().toCharArray();
			char[] tmp2 = new char[tmp.length];
			for(int i=0; i<tmp.length; i++){
				tmp2[i] = tmp[tmp.length-1-i];
			}
			idx++;
			return String.valueOf(tmp2);
		}
		return letter()+"";
	}
	
	public static char letter(){
		if(s[idx] == '+'){
			idx++;
			char res = letter();
			return res=='?' ? res : (char)((res+1-'A')%26+'A');
		}else if(s[idx] == '-'){
			idx++;
			char res = letter();
			return res=='?' ? res : (char)((res-1+26-'A')%26+'A');
		}
		return s[idx++];
	}
}