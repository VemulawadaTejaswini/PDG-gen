import java.io.IOException;
import java.util.Scanner;

public class Main{
	
	static int B;
	static int num;
	static int left ,right;
	
	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);

		for(B = scan.nextInt();B > 0;B = scan.nextInt()) {
			left = 1;
			right = 1;

			num = 0;

			for(int i = 1;;i++) {
				num += i;
				right = i;
				if(num >= B) { break; }
			}

			while(true) {
				if(num == B) {
					System.out.println(left + " " + (right - left + 1));
					break;
				}else if(num > B) {
					Numdec();
				}else if(num < B) {
					NumInc();
				}
			}
		}

		scan.close();
	}

	public static void NumInc() {
		while(num < B) {
			right++;
			num += right - left;
			left++;
		}
		if(num / 2 > B ) {
			left = B;
			right = B;
		}
	}

	public static void Numdec() {
		while(num > B) {
			num -= left;
			left++;
		}
	}
}
