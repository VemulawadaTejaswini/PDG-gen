import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
	    int W = sc.nextInt();
	    char[][] s = new char[H][W];
        for (int h = 0; h < H; h++) {
          String line = sc.next();
            for (int w = 0; w < W; w++) {
                s[h][w] = line.charAt(w);
            }
        }
        
        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                if (s[h][w] == '#'){
                    if (h > 0 && s[h-1][w] == '#') {
                        continue;
                    }
                    if (h < H - 1 && s[h+1][w] == '#') {
                        continue;
                    }
                    if (w > 0 && s[h][w-1] == '#') {
                        continue;
                    }
                    if (w < W - 1 && s[h][w+1] == '#') {
                        continue;
                    }
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
      
    }
}
