import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			StringBuilder sb = new StringBuilder(s);
			int q = sc.nextInt();
			boolean asc = true;
			for(int i = 0 ; i < q ; i++) {
				int t = sc.nextInt();
				if(t == 1) {
					asc = !asc;
				} else {
					int f = sc.nextInt();
					String c = sc.next();
					if(f == 1) {
						if(asc) {
							sb.insert(0, c);
						} else {
							sb.append(c);
						}
					} else {
						if(asc) {
							sb.append(c);
						} else {
							sb.insert(0, c);
						}
					}
				}
			}
			if(asc) {
				System.out.println(sb.toString());
			} else {
				String hoge = sb.toString();
				for(int i = hoge.length() - 1 ; i >= 0 ; i--) {
					System.out.print(hoge.charAt(i));
				}
			}
		}

	}

}
