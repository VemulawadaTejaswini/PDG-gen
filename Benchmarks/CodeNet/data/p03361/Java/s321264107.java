import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] map = new char[h+2][w+2];
        for(int i = 0; i < h+2; i++) {
            for(int j = 0; j < w+2; j++) {
                map[i][j] = '.';
            }
        }
        for(int i = 1; i <= h; i++) {
            String s = sc.next();
            for(int j = 0; j < w; j++) {
                map[i][j+1] = s.charAt(j);
            }
        }
        int[] y = {0, 1, 0, -1};
        int[] x = {1, 0, -1, 0};
        boolean flag = true;
        for(int i = 1; i < h+1; i++) {
            for(int j = 1; j < w+1; j++) {
                if(map[i][j]=='#') {
                    boolean isOK = false;
                    for (int k = 0; k < 4; k++) {
                        if (map[i + x[k]][j+y[k]]=='#') {
                            isOK = true;
                        }
                    }
                    if(!isOK) {
                        flag = false;
                    }
                }
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}