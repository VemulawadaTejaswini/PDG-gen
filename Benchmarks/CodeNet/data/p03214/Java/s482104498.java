package niconico;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int counter = scanner.nextInt();
		int[] sam = new int[counter];
		int sams = 0;
		
		for(int i = 0;i<counter;i++) {
			sam[i]= scanner.nextInt();
			sams += sam[i];
		}
		short ave = (short) (((short)sams)/((short)counter));
		
		short sa = 100;
		int result = -1;
		
		for(int i = 0;i<counter;i++) {
			if(sa > shortAbs((short) ((short)sam[i]-ave))) {
				sa = shortAbs((short) ((short)sam[i]-ave));
				result = i;
			}
		}
		System.out.println(result);
	}
	
	public static short shortAbs(short a) {
		if(a < 0) {
			return (short) -a;
		}
		else {
			return a;
		}
	}
}