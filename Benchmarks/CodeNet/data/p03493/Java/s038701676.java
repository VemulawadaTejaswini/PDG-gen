import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 String s = sc.next();
		 int answer = 0;
		
		 for(int i = 0;i < s.length();i++) {
			 char mas = s.charAt(i);
			 if('1' == mas) {
				 answer++;
			 }
		 }
		 System.out.println(answer);
	}
}
