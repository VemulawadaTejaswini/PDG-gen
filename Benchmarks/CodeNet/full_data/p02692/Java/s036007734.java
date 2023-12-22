import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		long mod = (long)(1e9+7);
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long A = input.nextInt();
		long B = input.nextLong();
		long C = input.nextLong();
		int[] cntPair = new int[3]; //AB,AC,BC
		int[] cntOne = new int[3]; //A,B,C
		String ans = "";
		boolean YES = true;
		for (int i = 0; i < N; i++) {
			String x = input.next();
			if (x.equals("AB")) {
				cntPair[0]++;
				cntOne[0]++;
				cntOne[1]++;
				if (A>=B) {
					A--;
					B++;
					ans+="B";
				}else {
					A++;
					B--;
					ans+="A";
				}
			}else if (x.equals("AC")) {
				cntPair[1]++;
				cntOne[0]++;
				cntOne[2]++;
				if (A>=C) {
					A--;
					C++;
					ans+="C";
				}else {
					A++;
					C--;
					ans+="A";
				}
			}else if (x.equals("BC")) {
				cntPair[2]++;
				cntOne[1]++;
				cntOne[2]++;
				if (B>=C) {
					B--;
					C++;
					ans+="C";
				}else {
					B++;
					C--;
					ans+="B";
				}
			}
			if (A<0||B<0||C<0) {
				System.out.println("No");
				YES=false;
				break;
			}
		}
		if (YES) {
			System.out.println("Yes");
			for (int i = 0; i < N; i++) {
				System.out.println(ans.charAt(i));
			}
		}
	}
}