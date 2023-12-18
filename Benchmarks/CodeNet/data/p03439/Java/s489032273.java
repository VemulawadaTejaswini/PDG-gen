import java.io.IOException;
import java.util.Scanner;

public class Main {
	static <T> void print(T t) {
		System.out.println(t);
        System.out.flush();
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String checkA = "NONE";
		String checkB = "NONE";
		for(int i = 0; i < 20; i++) {
			print("1 + 2 * i");
			String s = sc.next();
			if(s.equals("Male") || s.equals("Female")) {
				checkB = checkA;
				checkA = s;
				if(!(checkA.equals(checkB))) {
					print(2 * 1);
					break;
				}
			}else {
				print(i);
				break;
			}
		}
		sc.close();
	}

}