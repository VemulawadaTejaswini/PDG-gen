import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	private static int bingocard[][] = new int[3][3];

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		ArrayList<Integer> numlist = new ArrayList<Integer>();

		for(int i = 0; i < 3; i++) {

			for(int j = 0; j < 3; j++) {
				bingocard[i][j] = sc.nextInt();
			}
		}

		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int bingonum = sc.nextInt();
			numlist.add(bingonum);
		}

		for(int i = 0; i < 3; i++) {

			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < n; k++) {
					if(numlist.get(k) ==  bingocard[i][j]) {
						bingocard[i][j] = 0;
						break;
					}
				}
			}
		}

		if(IsWin()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}

	private static boolean IsWin() {
		if (bingocard[0][0]==0 && bingocard[0][1]==0 && bingocard[0][2]==0 ){
    		return true;
    	}
    	if (bingocard[1][0]==0 && bingocard[1][1]==0 && bingocard[1][2]==0 ){
    		return true;
    	}
    	if (bingocard[2][0]==0 && bingocard[2][1]==0 && bingocard[2][2]==0 ){
    		return true;
    	}
    	if (bingocard[0][0]==0 && bingocard[1][0]==0 && bingocard[2][0]==0 ){
    		return true;
    	}
    	if (bingocard[0][1]==0 && bingocard[1][1]==0 && bingocard[2][1]==0 ){
    		return true;
    	}
    	if (bingocard[0][2]==0 && bingocard[1][2]==0 && bingocard[2][2]==0 ){
    		return true;
    	}
    	if (bingocard[0][0]==0 && bingocard[1][1]==0 && bingocard[2][2]==0 ){
    		return true;
    	}
    	if (bingocard[2][0]==0 && bingocard[1][1]==0 && bingocard[0][2]==0 ){
    		return true;
    	}

		return false;
	}

}