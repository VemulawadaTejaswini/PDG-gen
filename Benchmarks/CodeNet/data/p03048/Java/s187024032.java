import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner input = new Scanner(System.in);

        int r = input.nextInt();
        int g = input.nextInt();
        int b = input.nextInt();
        int n = input.nextInt();

        int ansCnt = 0;

        for (int rn = 0; rn <= n/r; rn++) {
        	if (rn * r == n) {
        		ansCnt++;
        	} else {
            	for (int gn = 0; gn <= n/g; gn++) {
            		if (rn * r + gn * g == n) {
            			ansCnt++;
            		} else {
            			int rem = n - (rn * r + gn * g);
            			if (rem > 0) {
            				if (rem % b == 0) {
                    			ansCnt++;
            				}
            			}
            		}
            	}
        	}
        }

        System.out.println(ansCnt);
    }
}
