import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int q, i, a, b;
		StringBuilder str = new StringBuilder();
		String order;
		try (Scanner sc = new Scanner(System.in)) {
			str = str.append(sc.next());
			q = sc.nextInt();
			for(i = 0; i < q; i++) {
				order = sc.next();
				a = sc.nextInt();
				b = sc.nextInt();
				StringBuilder a_b = new StringBuilder();
				a_b = a_b.append(str.substring(a,b + 1));
				if(order.equals("print")) {
					System.out.println(a_b);
				}else if(order.equals("reverse")){
					a_b.reverse();
					str = str.replace(a, b + 1, a_b.toString());
				}else if(order.equals("replace")) {
					str = str.replace(a, b + 1, sc.next());
				}
			}
		}
	}
}

