import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[] str = scn.nextLine().toCharArray();
		int ans = 0;
		for(int i = 0;i < str.length;i++) {
		    char ch = str[i];
		    if(ch == 'A' || ch == 'T' || ch == 'C' || ch == 'G') {
		    	ans++;
		    }
		}
		System.out.println(ans);
	}

}
