import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();
		sc.close();
        int w = 100 * A;	// 水
        int s = 0;	// 砂糖
        for(int a = 0; 100 * a <= F; a++) {
        	for(int b = 0; 100 * b <= F; b++) {
        		int tmpW = 100 * A * a+ 100 * B *b;
        		if(tmpW == 0) continue;
        		for(int c = 0; tmpW + c * C <= F; c++) {
        			for(int d = 0; tmpW + d * D <= F; d++) {
        				int tmpS = c * C + d * D;
        				if(c == 0 && d == 0) continue;
        				int maxS = (A * a + B * b) * E;
        				if(maxS < tmpS) break;
        				int val = s * (tmpS + tmpW);
        				int tmpVal = tmpS * (s + w);
        				if(val < tmpVal) {
        					w = tmpW;
        					s = tmpS;
        				}
        			}
        		}
        	}
        }
        System.out.printf("%d %d\n", w + s, s);
    }
}