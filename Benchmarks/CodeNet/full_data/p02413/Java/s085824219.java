import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] table = new int[r+1][c+1];

        for(int i = 0; i < r; i++) {
        	for(int j = 0; j < c; j++) {
        		int x = sc.nextInt();
        		table[i][j] = x;
        		table[i][c] += x;
        		table[r][j] += x;
        		table[r][c] += x;
        	}
        }

        for(int i = 0; i < r+1; i++) {
        	for(int j= 0; j < c+1; j++) {
        		if(j == c) {
            		System.out.println(table[i][j]);
        		} else {
            		System.out.print(table[i][j] + " ");
        		}
        	}
        }
    }
}
