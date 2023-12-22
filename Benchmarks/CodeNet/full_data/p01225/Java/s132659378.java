import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		boolean[][] cardHasFlag = new boolean[3][9];
		
		int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			String color = sc.next();
			int card = sc.nextInt();
			
			switch(color) {
			case "赤" :
                    cardHasFlag[0][card-1] = true;
                    break;
                case "緑" :
                    cardHasFlag[1][card-1] = true;
                    break;
                case "青" :
                    cardHasFlag[2][card-1] = true;
                    break;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0 ; j < 9; j++) {
                if (cardHasFlag[i][j] == false) {
                    switch (i) {
                        case 0 :
                            System.out.printf("S %d\n", j+1);
                            break;
                        case 1 :
                            System.out.printf("H %d\n", j+1);
                            break;
                        case 2 :
                            System.out.printf("C %d\n", j+1);
                            break;
                    }
                }
            }
        }
    }
}
