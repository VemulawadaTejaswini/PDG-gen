import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		String c;
		int x;
		int dataS[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int dataH[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int dataC[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int dataD[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		
		for( int i = 1; i <= n; i++) {
			c = stdIn.next();
			x = stdIn.nextInt();
			
			switch(c) {
			case "S":
				for(int j = 0; j < 13; j++) {
					if(dataS[j] == x) {
						dataS[j] = 0;
						break;
					}
				}
				break;
			case "H":
				for(int j = 0; j < 13; j++) {
					if(dataH[j] == x) {
						dataH[j] = 0;
						break;
					}
				}
				break;
			case "C":
				for(int j = 0; j < 13; j++) {
					if(dataC[j] == x) {
						dataC[j] = 0;
						break;
					}
				}
				break;
			case "D":
				for(int j = 0; j < 13; j++) {
					if(dataD[j] == x) {
						dataD[j] = 0;
						break;
					}
				}
				break;
			default:
				break;
			}
		}
		
		for(int i = 0; i < 4; i++) {
			switch(i) {
			case 0:
				for(int j = 0; j < 13; j++) {
					if(dataS[j] != 0) {
						System.out.println("S　" + dataS[j]);
					}
				}
				break;
			case 1:
				for(int j = 0; j < 13; j++) {
					if(dataH[j] != 0) {
						System.out.println("H　" + dataH[j]);
					}
				}
				break;
			case 2:
				for(int j = 0; j < 13; j++) {
					if(dataC[j] != 0) {
						System.out.println("C　" + dataC[j]);
					}
				}
				break;
			case 3:
				for(int j = 0; j < 13; j++) {
					if(dataD[j] != 0) {
						System.out.println("D　" + dataD[j]);
					}
				}
				break;
			default:
				break;
			}
		}
		
	}
}
