
import java.util.Scanner;

class Main{	
	public static void main(String[] args)   {		
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		
		int cs = scanner.nextInt();
		int[][] ca = new int[cs][3];
		
		for(int i = 0; i < cs; i++ ) {	
			int pt =  scanner.nextInt();
			int ys =  scanner.nextInt();
			int seq = getSeq(ca, pt, ys);
			ca[i][0] = pt;
			ca[i][1] = ys;
			ca[i][2] = seq;
		}	
		
		for(int i = 0; i < cs; i++) {
			System.out.println(getFullNumber(ca[i][0]) + getFullNumber(ca[i][2]));
		}
		
	}	
	

	private static int getSeq(int[][] ca, int pt, int ys) {
		int seq = 1;
		for(int i = 0 ; i < ca.length; i++) {
			if(ca[i][0] == 0) {
				break;
			}
			if(ca[i][0] == pt) {
				if(ca[i][1] > ys) {
					ca[i][2]++;
				}else {
					seq++;
				}
			}
		}
		return seq;
	}


	private static String getFullNumber(int number) {
		String n = String.valueOf(number);
		int len = 6 - n.length();
		for(int i = 0; i < len; i++) {
			n = "0" + n;
		}
		return n;
	}

}