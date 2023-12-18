import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String S=sc.next();
		int O=0,I=0;
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='0') {
				O++;
			}else if(S.charAt(i)=='1') {
				I++;
			}
		}
		System.out.println(2*Math.min(O, I));
	}
}