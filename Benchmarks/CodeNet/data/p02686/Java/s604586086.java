import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long bef=0 ;
		long aft= 0;
		for (int i=0;i<N;i++) {
			String s=sc.next();
			Stack<Character> stack = new Stack<Character>();
			for (int j=0;j<s.length();j++) {
				if (stack.empty()==true) {
					stack.add(s.charAt(j));
				} else {
					if (s.charAt(j)==')'&&stack.peek()=='(') {
						stack.pop();
					} else {
						stack.add(s.charAt(j));
					}
				}
			}
			long tempBef = 0;
			long tempAft =0;
			while (stack.empty()==false) {
				Character c= stack.pop();
				if (c=='(') {
					tempBef++;
				} else  {
					tempAft++;
				}
			}
			long tBef=0;
			long tAft=0;
			if (bef>0) {
				if (tempBef>bef) {
					tBef=tempBef-bef;
				}
			} else {
				tBef= tempBef;
			}
			if (aft>0) {
				if (tempAft>aft) {
					tAft=tempAft-aft;
				}
			} else {
				tAft= tempAft;
			}
			if (tBef>0) {
				aft += tBef;
			} else {
				bef = bef-tempBef;
			}
			if (tAft>0) {
				bef += tAft;
			} else {
				aft = aft-tempAft;
			}
		}
		if (bef==0&&aft==0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}