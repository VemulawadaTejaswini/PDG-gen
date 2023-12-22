import java.util.*;

public class Main {
	String s;
	int id;
	
	StringBuilder fnc(){
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		while(true){
			if(id==s.length()) return sb;
			char c = s.charAt(id);
			id++;
			if(c=='[') sb.append(fnc());
			else if(c==']') return sb.reverse();
			else if(c=='+') cnt++;
			else if(c=='-')	cnt--;
			else{
				int x = c-65;
				if(x==-2) x = 65;
				else if(x+cnt>=0) x = 65 + (x+cnt)%26;
				else x = 91 + (x+cnt)%26;
				sb.append((char)x);
				cnt = 0;
			}
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			s = sc.next();
			if(s.equals(".")) break;
			id = 0;
			System.out.println(fnc());
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}	
}