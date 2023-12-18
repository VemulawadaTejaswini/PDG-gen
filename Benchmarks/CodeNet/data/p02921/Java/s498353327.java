import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String c = sc.nextline();
		char[] s = new char[3];
		char[] c = new char[3];
		int count = 0;
		for(int i = 0; i < 3; i++){
			s[i] = s.charAt(i);
			c[i] = c.charAt(i);
			if(s[i] == c[i]){
				count++;
			}
		}
		System.out.println(count);
	}

}