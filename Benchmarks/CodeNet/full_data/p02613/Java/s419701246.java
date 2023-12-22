import java.util.*;
public class Main{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int c0=0,c1=0,c2=0,c3=0;
		for (int i = 0; i < N; ++i) {
			String S = sc.nextLine();
			if (S.equals("AC")) ++c0;
			else if (S.equals("WA")) ++c1;
			else if (S.equals("TLE")) ++c2;
			else ++c3;
		}
		System.out.println("AC × " + c0);
		System.out.println("WA × " + c1);
		System.out.println("TLE × " + c2);
		System.out.println("RE × " + c3);
	}
}