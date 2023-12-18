import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String sample = "abcdefghijklmnopqrstuvwxyz";
		int[] sum = new int[26];
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<26;j++) {
				if(sample.charAt(j)==s.charAt(i)) {
					sum[j]++;
					break;
				}
			}
		}
		int flg=0;

		for(int i:sum) {
			if(i%2!=0) {
				flg=1;
				break;
			}
		}

		if(flg!=1) {
			System.out.println("Yes");//Yes or YES注意！！
		}else {
			System.out.println("No");//No or NO注意！！
		}

	}
	public static int sample(int n) {
		return n;
	}

}
