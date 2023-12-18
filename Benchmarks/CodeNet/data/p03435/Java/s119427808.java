import java.util.*;


public  class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] values = new int[3][3];
        for (int y = 0; y < 3; y++) {
        	for (int x = 0; x < 3; x++) {
        		values[y][x] = sc.nextInt();
        	}
        }
        
        int[] a_values = new int[3];
        int[] b_values = new int[3];
        a_values[0] = 0;
        for (int x = 0; x < 3; x++) {
        	b_values[x] = values[0][x];
        }
        for (int y = 1; y < 3; y++) {
        	a_values[y] = values[y][0] - b_values[0];
        }
        
        for (int y = 0; y < 3; y++) {
        	for (int x = 0; x < 3; x++) {
        		if (values[y][x] != a_values[y] + b_values[x]) {
        			System.out.println("No");
        			return;
        		}
        	}
        }
        System.out.println("Yes");
    }
}