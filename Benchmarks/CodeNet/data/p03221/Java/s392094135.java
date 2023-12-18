
import java.util.Scanner;

class Test2 {	
	public static void main(String[] args)  {		
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		int cs = scanner.nextInt();
		int[] ca = new int[cs];
		int[] ys = new int[cs];
		
		for(int i = 0; i < cs; i++ ) {
			ca[i] = scanner.nextInt();
			ys[i]  = scanner.nextInt();
		}
		
		for(int i = 0; i < cs; i++) {
			int num = ca[i];
			int seq = getseq(num, ys[i],  ca, ys);
			System.out.println(getFullNumber(num) + getFullNumber(seq));
		}
	}
	
	static int getseq(int num, int year, int[] ca, int[] ys) {
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