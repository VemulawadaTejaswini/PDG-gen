import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		new Main();	
	}
 
	public Main() {
		new aoj510().doIt();
	}
	class aoj510{
		void alf(char ctr[]){
			for(char c = 'A';c <= 'Z';c++){
				if(c < 'D')ctr[c] = (char)(c+23);
				else ctr[c] = (char)(c-3);
			}
		}
		void doIt(){
			char ctr[] = new char[128];
			alf(ctr);
			char str[] = sc.next().toCharArray();
			int length = str.length;
			StringBuilder sb = new StringBuilder();
			for(int i = 0;i < length;i++){
				sb.append(ctr[str[i]]);
			}
			System.out.println(sb);
		}
	}
}