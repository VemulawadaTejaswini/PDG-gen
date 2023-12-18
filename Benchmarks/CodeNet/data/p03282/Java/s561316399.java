import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		long k = sc.nextLong();

		char c[] = s.toCharArray();
		int i = 0;
		if (c[0] == '1') {
			while (c[i] == '1') {
				i++;
			}
		}

		// 1からiまで
if(k<=i){
	System.out.println(1);
}else{
	System.out.println(c[i]);
}
	}
}