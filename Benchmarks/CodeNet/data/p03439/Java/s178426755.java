import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String checkA = "NONE";
		String checkB = "NONE";
		for(int i = 0; i < 20; i++) {
			System.out.println("1 + 2 * i");
			String s = sc.next();
			if(s.equals("Male") || s.equals("Female")) {
				checkB = checkA;
				checkA = s;
				if(!(checkA.equals(checkB))) {
					System.out.println(2 * 1);
					break;
				}
			}else {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}

}
/*
□□□□□■□□□■□□□□□□□
□□□□□■□□□■□□□□□□□
□□□□□■□□□■□□□□□□□
□□□□□■□□□■□□□■■□□
■■■■■■□□□■□■■■□□□
□□□□□■□□□■■■□□□□□
□□□□□■□□□■□□□□□□□
□□□□□■□□□■□□□□□□□
□□□□□■□□□■□□□□□□□
□□□□□■□□□■□□□□□□□
□□□□□■□□□■□□□□□□□
□□□■■■□□□■□□□□□□□
□■■■□■□□□■□□□□□■□
■■□□□■□□□■■□□□■■□
□□□□□■□□□□■■■■■□□
□□□□□■□□□□□□□□□□□
□□□□□□□■□□□□□□□□□
□□□□□□□■□□□□□□□□□
□□□□□□□■□□□□□□□□□
□□□□□□□■□□□□□□□□□
□□□□□□□■□□□□□□□□□
■■■■■■■■■■■■■■■■□
□□□□□□□■□□□□□□□□□
□□□□□□■■■□□□□□□□□
□□□□□□■□■□□□□□□□□
□□□□□□■□■■□□□□□□□
□□□□□■■□□■□□□□□□□
□□□□□■□□□■■□□□□□□
□□□□■■□□□□■■□□□□□
□□□■■□□□□□□■■□□□□
□□■■□□□□□□□□■■□□□
■■■□□□□□□□□□□■■■□
*/