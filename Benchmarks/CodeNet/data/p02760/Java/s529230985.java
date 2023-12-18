import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
    		final int CHECKED = 0;

    		final int[][] a  = new int[3][3];
    		for (int i=0; i<3; i++) {
    			for (int j=0; j<3; j++) {
    				a[i][j] = sc.nextInt();
    			}
    		}
    		final int n = sc.nextInt();
    		final int[] b = new int[n];
    		for (int i=0; i<n; i++) {
    			b[i] = sc.nextInt();
    		}

    		for (int bi=0; bi<n; bi++) {
    			for (int ai=0; ai<3; ai++) {
    				for (int aj=0; aj<3; aj++) {
    					if (a[aj][aj] == b[bi]) {
    						a[ai][aj] = CHECKED;
    					}
    				}
    			}
    		}

    		if (   (a[0][0] == CHECKED && a[0][1] == CHECKED && a[0][2] == CHECKED)
    			|| (a[1][0] == CHECKED && a[1][1] == CHECKED && a[1][2] == CHECKED)
    			|| (a[2][0] == CHECKED && a[2][1] == CHECKED && a[2][2] == CHECKED)
    			|| (a[0][0] == CHECKED && a[1][0] == CHECKED && a[2][0] == CHECKED)
    			|| (a[0][1] == CHECKED && a[1][1] == CHECKED && a[2][1] == CHECKED)
    			|| (a[0][2] == CHECKED && a[1][2] == CHECKED && a[2][2] == CHECKED)
    			|| (a[0][0] == CHECKED && a[1][1] == CHECKED && a[2][2] == CHECKED)
    			|| (a[0][2] == CHECKED && a[1][1] == CHECKED && a[2][0] == CHECKED)
    				) {
    			System.out.println("Yes");
    		} else {
    			System.out.println("No");
    		}

    	} finally {
    		sc.close();
    	}
    }
}
