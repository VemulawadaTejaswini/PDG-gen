import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[] str = scn.nextLine().toCharArray();
		int ans = 0;
		int buf = 0;
		for(int i = 0;i < str.length;i++) {
		    char ch = str[i];
		    if(ch == 'A' || ch == 'T' || ch == 'C' || ch == 'G') {
		    	buf++;
		    	ans = Math.max(buf, ans);
		    }else {
		    	buf = 0;
		    }
		}
		System.out.println(ans);
	}

}
