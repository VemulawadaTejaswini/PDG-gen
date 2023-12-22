import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		a: for(;;){
			int a[] = new int[5];
			for (int i = 0; i < 5; i++) {
				a[i] = stdIn.nextInt();
				if(a[i]==0)break a;
			}
			int x = 0;
			int y = 0;
			int z = 0;
			for (int i = 0; i < 5; i++) {
				if (a[i] == 1) {
					x++;
				}
				if (a[i] == 2) {
					y++;
				}
				if (a[i] == 3) {
					z++;
				}
			}
			if (1 <= x && 1 <= y && 1 <= z) {
				for (int i = 0; i < 5; i++) {
					System.out.println(3);
				}
			} else if (1 <= x && 1 <= y) {
				for (int i = 0; i < 5; i++) {
					if (a[i] == 1)
						System.out.println(1);
						else
						System.out.println(2);
				}
			} else if (1 <= x && 1 <= z) {
				for (int i = 0; i < 5; i++) {
					if (a[i] == 1)
						System.out.println(2);
					else
						System.out.println(1);
				}
			} else if (1 <= y && 1 <= z) {
				for (int i = 0; i < 5; i++) {
					if (a[i] == 2)
						System.out.println(1);
					else
						System.out.println(2);
				}
			}
		}
	}
}