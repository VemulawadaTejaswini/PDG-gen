import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        char[][] ary;

        while (sc.hasNext()) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            
            if (h == 0 && w == 0) break;
            
            ary = new char[h][w];
            
            for (int i = 0; i < h; i++) {
                String s = sc.next();
                for (int j = 0; j < w; j++) {
                    ary[i][j] = s.charAt(j);
                }
            }
            
            // ?????¨??????
            int x = 0;
            int y = 0;
            
            while (true) {
                char c = ary[x][y];
                ary[x][y] = 'L';
                
                if (c == '>') {
                    y++;
                } else if (c == '<') {
                    y--;
                } else if (c == 'v') {
                    x++;
                } else if (c == '^') {
                    x--;
                } else if (c == '.') {
                    System.out.println(y + " " + x);
                    break;
                } else if (c == 'L') {
                    System.out.println("LOOP");
                    break;
                }
            }
        }
    }
}