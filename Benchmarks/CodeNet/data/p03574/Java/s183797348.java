
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int h = sc.nextInt();
        int w = sc.nextInt();
 
        char s[][] = new char[h+2][w+2];
        for (int i = 1; i <= h; i++) {
        	String str = sc.next();
			for (int j = 1; j <= w; j++) {
				s[i][j] = str.charAt(j - 1);
			}
		}
 
        
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                int count = 0;
                if (s[i][j] == '#') {
                    System.out.print('#');
                    continue;
                }
 
                if (s[i-1][j-1] == '#') count++;
                if (s[i][j-1] == '#') count++;
                if (s[i+1][j-1] == '#') count++;
                if (s[i-1][j] == '#') count++;
                if (s[i+1][j] == '#') count++;
                if (s[i-1][j+1] == '#') count++;
                if (s[i][j+1] == '#') count++;
                if (s[i+1][j+1] == '#') count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }
}