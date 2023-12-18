import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] sum =new int[26];
		int[] sums = new int[26];
		for(int i=0;i<26;i++) {
			sums[i] = 1;
		}
		int flg=0;
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<26;j++) {
				if(sum[i] == s.charAt(i)) {
					sums[i] ++;
					flg=1;
					break;
				}
			}
			if(flg==0) {
				sum[i] = s.charAt(i);
			}
			flg=0;
		}
		flg=0;
		for(int i=0;i<26;i++) {
			if(sums[i]%2!=0) {
				flg=1;
				break;
			}
		}
		if(flg==0) {
			System.out.println("Yes");//Yes or YES注意！！
		}else {
			System.out.println("No");//No or NO注意！！
		}

	}
	public static int sample(int n) {
		return n;
	}

}
