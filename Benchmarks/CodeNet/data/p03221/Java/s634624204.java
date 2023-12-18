import java.io.FileNotFoundException;
import java.util.Scanner;

class Test {
	
	public static void main(String[] args) throws FileNotFoundException {		
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		int citys = scanner.nextInt();
		int[] ca = new int[citys];
		int[] ys = new int[citys];
		
		for(int i = 0; i < citys; i++ ) {
			ca[i] = scanner.nextInt();
			ys[i]  = scanner.nextInt();
		}
		
		for(int i = 0; i < citys; i++) {
			int num = ca[i];
			int seq = getseq(num, ys[i],  ca, ys);
			System.out.println(getFullNumber(num) + getFullNumber(seq));
		}
	}
	
	private static int getseq(int num, int year, int[] ca, int[] ys) {
		int sequ = 1;
		for(int i = 0; i < ys.length; i++) {
			if(ca[i] == num && year > ys[i]) {
				sequ++;
			}
		}
		return sequ;
	}

	static String getFullNumber(int number) {
		String n = String.valueOf(number);
		int len = 6 - n.length();
		for(int i = 0; i < len; i++) {
			n = "0" + n;
		}
		return n;
	}

}
