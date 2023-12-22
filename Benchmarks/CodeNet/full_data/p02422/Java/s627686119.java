import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			String s = sc.next();
			String s2 = s;
			String s3 = s;
			int q= sc.nextInt();
			for (int i=0; i<q; i++) {
				String command = sc.next();
				int a = sc.nextInt();
				int b = sc.nextInt();

				switch(command) {
				case "replace":
					String p = sc.next();
					s3 = s2.substring(0,a) + p + s2.substring(b+1);
					s2 = s3;
					break;
				case "reverse":
					s3 = s2.substring(a,b+1);
					StringBuffer sb = new StringBuffer(s3);
					String reverse = sb.reverse().toString();
					s3 = s2.substring(0,a) + reverse + s2.substring(b+1);
					s2 = s3;
					break;
				case "print":
					s3 = s2.substring(a, b+1);
					System.out.println(s3);  //結果表示
					break;

				}
			}
		}
	}
}
