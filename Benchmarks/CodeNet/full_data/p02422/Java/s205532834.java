import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		StringBuilder sb = new StringBuilder(scan.next());
		int q = scan.nextInt();

		for(int i = 0; i < q; i++){

			String cmd = scan.next();
			int a = scan.nextInt();
			int b = scan.nextInt() + 1;

			if(cmd.equals("print")){

				System.out.println(sb.substring(a, b));

			}else if(cmd.equals("reverse")){

				StringBuilder tmp = new StringBuilder(sb.substring(a, b));
				String tmp2 = tmp.reverse().toString();
				sb = sb.replace(a, b, tmp2);

			}else if(cmd.equals("replace")){

				String p = scan.next();
				sb = sb.replace(a, b, p);

			}
		}
	}

}