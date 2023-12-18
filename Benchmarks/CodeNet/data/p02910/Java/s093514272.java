import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		String S = stdin.next();
		int flag = 1;
		String list[] = new String[S.length()];
		
		for(int i=0;i<S.length();i++) {
			list[i] = S.substring(i,i+1);
		}
		for(int i=0;i<list.length;i++) {
			if(i % 2 == 0) {
				if(list[i].equals("L")) {
					flag=0;
					break;
				}
			}
			else if(i%2 != 1) {
				if(list[i].equals("R")) {
					flag=0;
					break;
				}
			}
		}
		if(flag==1) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
	}
}