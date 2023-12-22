import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

			Scanner scan = new Scanner(System.in);
			// ?????°???????????????
			int T = scan.nextInt();
			
			// ?????°?????°?????????
			for(int Ti=0; Ti<T; Ti++) {
				int cards[][] = new int[9][3];
				//String color[] = {"R", "G", "B"};
				
				int n[];
				n = new int[9];
				for (int i=0; i<9; i++){
					n[i] = scan.nextInt();
				}
				int c[];
				c = new int[3];
				String C ="";
				for (int i=0; i<9; i++){
					C = scan.next();
					if (C.equals("R")) c[i] = 0;
					else if (C.equals("G")) c[i] = 1;
					else if (C.equals("B")) c[i] = 2;
				}
				// ??????????????°????????????????´?
				for (int i2=0; i2<3; i2++){
					for (int i=0; i<9; i++){
						int x = n[i];
						int y = c[i];
						cards[x][y] = cards[x][y] + 1;
					}
				}
				// ?¢????
				int check = 0;
				for (int i2=0; i2<3; i2++){
					for (int i=0; i<9; i++){
						if (cards[i][i2] == 3){
							check = check +1;
							break;
						}
						if(check != 0) break;
					}
					if(check != 0) break;
				}
				for (int i2=0; i2<3; i2++){
					if(check != 0) break;
					for (int i=0; i<7; i++){
						if ((cards[i][i2] != 0) && (cards[i+1][i2] != 0) && (cards[i+2][i2] != 0)){
							check = check +1;
							break;
						}
						if(check != 0) break;
					}
				}
				// ??????
				if(check != 0) System.out.println(1);
				else System.out.println(0);
				
			} // T????????°?????°?????????
	}

}