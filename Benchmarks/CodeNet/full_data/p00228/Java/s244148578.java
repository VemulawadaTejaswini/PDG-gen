
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
			
		while (true) {
			int n = stdIn.nextInt();
			if(n == -1) {
				break;
			}
			int[] arr = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = stdIn.nextInt();
			}
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			int f = 0;
			int g = 0;
			
			int ta = 0;
			int tb = 0;
			int tc = 0;
			int td = 0;
			int te = 0;
			int tf = 0;
			int tg = 0;
			
			for(int i = 0; i < n; i++) {
				ta = a;
				tb = b;
				tc = c;
				td = d;
				te = e;
				tf = f;
				tg = g;
				switch(arr[i]) {
				case 0:
					a = b = c = d = e = f = 1;
					g = 0;
					break;
				case 1:
					b = c = 1;
					a = d = e = f = g = 0;
					break;
				case 2:
					a = b = d = e = g = 1;
					f = c = 0;
					break;
				case 3:
					a = b = c = d = g = 1;
					e = f = 0;
					break;
				case 4:
					b = c = f = g = 1;
					a = d = e = 0;
					break;
				case 5:
					a = c = d = f = g = 1;
					b = e = 0;
					break;
				case 6:
					a = c = d = e = f = g = 1;
					b = 0;
					break;
				case 7:
					a = b = c = f = 1;
					d = e = g = 0;
					break;
				case 8:
					a = b = c = d = e = f = g = 1;
					break;
				case 9:
					a = b = c = d = f = g = 1;
					e = 0;
					break;
				}
				if(tg == g) {
					System.out.print(0);
				}
				else {
					System.out.print(1);
				}
				if(tf == f) {
					System.out.print(0);
				}
				else {
					System.out.print(1);
				}
				if(te == e) {
					System.out.print(0);
				}
				else {
					System.out.print(1);
				}
				if(td == d) {
					System.out.print(0);
				}
				else {
					System.out.print(1);
				}
				if(tc == c) {
					System.out.print(0);
				}
				else {
					System.out.print(1);
				}
				if(tb == b) {
					System.out.print(0);
				}
				else {
					System.out.print(1);
				}
				if(ta == a) {
					System.out.print(0);
				}
				else {
					System.out.print(1);
				}
				System.out.println();
			}
		}
	}
		
}