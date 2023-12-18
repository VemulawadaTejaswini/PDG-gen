import java.util.Scanner;

public class c101_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char s[] = new char[4];
		String S = sc.nextLine();
		int num = 0;
		for(int i=0;i<4;i++) {
			s[i] = S.charAt(i);
			if(s[i] == '+')num++;
			else if(s[i] == '-')num--;
		}
		System.out.print(num);
	}
}