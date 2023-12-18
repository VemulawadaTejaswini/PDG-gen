import java.util.Scanner;
//AGC029A
//Main
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int len = S.length();
		int count = 0;
		int num = 0;
		int R[] = new int[len];

		for(int i = 0; i< S.length();i++) {
			if(S.substring(i, i+1).equals("W")) {
				count+= i-num;
				num++;
			}
		}

		System.out.println(count);

	}

}