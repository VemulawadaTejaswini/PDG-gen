import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		StringBuilder as = new StringBuilder();
		StringBuilder bs = new StringBuilder();
		StringBuilder cs = new StringBuilder();

		as.append(a);
		bs.append(b);
		cs.append(c);

		int count = 0;

		if(a.equals(b)&&a.equals(c)) {
			System.out.println(count);
		}
		else {
			for(int i = 0; i<n; i++) {
				if(as.charAt(i) == bs.charAt(i)) {
					if(as.charAt(i) == cs.charAt(i)) {
						continue;
					}
					else {
						cs.setCharAt(i, as.charAt(i));
						count++;
					}
				}else if(as.charAt(i) == cs.charAt(i)) {
					bs.setCharAt(i, as.charAt(i));
					count++;
				}
				else if(bs.charAt(i) == cs.charAt(i)) {
					as.setCharAt(i, bs.charAt(i));
					count++;
				}else {
					cs.setCharAt(i, as.charAt(i));
					bs.setCharAt(i, as.charAt(i));
					count+=2;
				}
			}
			System.out.println(count);
		}

	}

}