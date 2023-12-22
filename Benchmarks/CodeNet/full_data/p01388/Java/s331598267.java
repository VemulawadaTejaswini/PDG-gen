import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int l = s.length();
		char[] ss = new char[l];
		for(int i=0;i<l;i++) {
			ss[i] = s.charAt(i);
		}
		int[] count = new int[4];
		for(int i=0;i<l;i++) {
			if(ss[i] == 'K') count[0]++;
			if(ss[i] == 'U') count[1]++;
			if(ss[i] == 'P') count[2]++;
			if(ss[i] == 'C') count[3]++;
		}
		int ans = 300;
		for(int i=0;i<4;i++) {
			ans = Math.min(ans, count[i]);
		}
		System.out.println(ans);
	}	
}



