import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
/*		char[] s = stdIn.next().toCharArray();
		
		int sum = 0;
		for(char a: s) {
			if(a == '1') {
				sum++;
			}
		}
		System.out.println(sum);*/
		/*
		int cnt = 0;
		String[] s = stdIn.next().split(""); //splitを使う。toCharArray()を使う。substring()を使う方法がある
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("1")) {
				cnt++;
			}
		}
		System.out.println(cnt);
		*/
		int cnt = 0;
		String s1 = stdIn.next();
		String s2 = stdIn.next();
		String s3 = stdIn.next();
		if(s1.equals("1")) {
			cnt++;
		}
		if(s2.equals("1")) {
			cnt++;
		}
		if(s3.equals("1")) {
			cnt++;
		}
		System.out.println(cnt);
		
	}

}
