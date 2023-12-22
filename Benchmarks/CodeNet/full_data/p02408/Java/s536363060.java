import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] l = new int[4][13];

        for(int i = 0; i < a; i++) {
        	String cardType = sc.next();
        	int cardNum = sc.nextInt();

        	switch(cardType) {
        	case "S":
        		l[0][cardNum-1] = 1;
        		break;
        	case "H":
        		l[1][cardNum-1] = 1;
        		break;
        	case "C":
        		l[2][cardNum-1] = 1;
        		break;
        	case "D":
        		l[3][cardNum-1] = 1;
        		break;
        	}
        }

        for(int i = 0; i < 4; i++) {

        	for(int j = 0; j < 13; j++) {

        		if(l[i][j] == 0) {

        			switch(i) {
        			case 0:
        				System.out.println("S " + (j+1) );
        				break;
        			case 1:
        				System.out.println("H " + (j+1) );
        				break;
        			case 2:
        				System.out.println("C " + (j+1) );
        				break;
        			case 3:
        				System.out.println("D " + (j+1) );
        				break;
        			}
        		}
        	}
        }
	}
}

