import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][][] l = new int[4][3][10];

        for(int i = 0; i < a; i++) {
        	int tou = sc.nextInt();
        	int kai = sc.nextInt();
        	int heya = sc.nextInt();
        	int ninzu = sc.nextInt();

        	l[tou-1][kai-1][heya-1] += ninzu;
        }

        for(int i = 0; i < 4; i++) {
        	for(int j = 0; j < 3; j++) {
        		for(int k = 0; k < 10; k++) {
        			System.out.print(" " + l[i][j][k]);
        		}
        		System.out.println();
        	}

        	if(i != 3) System.out.println("####################");
        }
	}
}

