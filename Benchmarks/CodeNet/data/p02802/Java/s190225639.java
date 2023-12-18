import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int c[] = new int[n];
		int sum = 0;
		int counter = 0;

		for(int i = 0; i < m; i++) {
			int p = sc.nextInt()-1;
			String s = sc.next();

			if(c[p] != -1) {
				if(s.equals("WA")) {
					c[p]++;
				}else {
					sum += c[p];
					counter++;
					c[p] = -1;
				}
			}
		}


		System.out.println(counter + " " + sum);
        return;
    }

}

