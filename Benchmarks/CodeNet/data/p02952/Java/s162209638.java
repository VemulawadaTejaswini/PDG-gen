import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
      	int b = Integer.parseInt(a);
		int count = 9;
		if (a.length() == 1) {
			System.out.println(a.charAt(0));
		} else if (a.length() == 2){
        	System.out.println(count);
                          System.out.println("D");
        } else if (a.length() > 2 ) {
			for (int i = 3; i < a.length() + 1; i++) {
				if (i % 2 == 0) {
					continue;
				}
				if (i != a.length()) {
					count +=Math.pow(10, i) - Math.pow(10, i - 1) -1;
				}
				if (i == a.length()) {
					count += b - Math.pow(10, i -1) + 1;

				}
			}
				System.out.println(count);

			}
		}

	}
