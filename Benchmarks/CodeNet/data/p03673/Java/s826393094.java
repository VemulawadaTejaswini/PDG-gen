import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Scanner scan = new Scanner(System.in);
		String str = "";
		StringBuffer sb = new StringBuffer(str);
		for (int i = 0; i < n; i++) {
			str = str + scan.next();
		}
		for (int i = 0;i < n; i++){
			sb.append(str.charAt(i));
			sb.reverse();
		}
		System.out.println(sb);
		s.close();
		scan.close();

	}

}
