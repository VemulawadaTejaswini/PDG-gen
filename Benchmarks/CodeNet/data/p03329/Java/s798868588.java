import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int count = 0;

		while(true) {
			int y = 1;
			int z = 1;

			if (a < 6) {
				count = count + a;
				break;
			}

			while(y * 6 <= a) {
				y = y * 6;
				//System.out.println(y);
			}
			while(z * 9 <= a) {
				z = z * 9;
				//System.out.println(z);
			}
			//System.out.println((count+1) + " - y:" + y + " z:" + z);
			if (a - y >= a - z) {
				a = a - z;
				//System.out.println("z " + a);
			}
			else {
				a = a - y;
				//System.out.println("y " + a);
			}
			//System.out.println(a);
			count++;
		}

		System.out.println(count);
	}
}