import java.util.*;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int P = 700;
		for (int i = 0; i < 3; i++) {
			if (S.substring(i, i + 1).equals("o")) {
				P += 100;
			}
		}
		System.out.println(P);
	}
}