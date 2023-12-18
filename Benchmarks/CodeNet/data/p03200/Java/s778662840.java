import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] S = sc.next().toCharArray();
		int count = 0;
		int i = 0;
		while(true) {
			if('B'==(S[i]) && i+1 != S.length) {
				if('W'==(S[i+1])) {
					S[i] = 'W';
					S[i+1] = 'B';
					count ++;
					i = 0;
					continue;
				}
			}
			i ++;
			if(i+1 == S.length) {
				break;
			}
		}
		System.out.println(count);
	}
}