import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[][];
		int b[];
		int index;
		String st;
		
		a = new int[8][8];
		b = new int[4];
		while (sc.hasNext()) {
			index = 0;
			for (int i = 0; i < 8; i++) {
				st = sc.next();
				for (int j = 0; j < 8; j++) {
					a[i][j] = st.charAt(j) - '0';
				}
			}
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {
					if (a[i][j] == 1) {
						b[index++] = i * 8 + j;
					}
				}
			}
			if (b[1] - b[0] == 1) {
				if (b[2] - b[1] == 1) {
					System.out.println("C");
				} else if (b[2] - b[1] == 6) {
					System.out.println("G");
				} else if (b[2] - b[1] == 7){
					System.out.println("A");
				} else {
					System.out.println("E");
				}
			} else if (b[1] - b[0] == 8) {
				if (b[2] - b[1] == 1) {
					System.out.println("F");
				} else {
					System.out.println("B");
				}
			} else {
				System.out.println("D");
			}
		}
	}
}