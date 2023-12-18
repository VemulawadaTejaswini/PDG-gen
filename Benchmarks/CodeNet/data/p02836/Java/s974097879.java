//Atcoder ABC147 B

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char S[] = sc.next().toCharArray();
		int length = S.length;
		char c =' ';
		char d =' ';
		int cnt = 0;

		for(int i=0;i<length/2;i++) {
			c = S[i];
			d = S[length-i-1];
			if(c!=d) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
