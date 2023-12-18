import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();

        char[][] s = new char[h][w];
        for(int i=0; i<h; i++) {
            s[i] = sc.nextLine().toCharArray();
        }
        sc.close();

        int[] x = {1, 1, 0, -1, -1, -1, 0, 1};
        int[] y = {0, 1, 1, 1, 0, -1, -1, -1};

        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                if(s[i][j] == '.') {
                    int cnt = 0;
                    for(int k=0; k<8; k++) {
                        int nx = i + x[k];
                        int ny = j + y[k];
                        if(nx < h && ny < w && nx >= 0 && ny >= 0 && s[nx][ny] == '#') {
                            cnt++;
                        }
                        s[i][j] = (char)(cnt + '0');
                    }
                }
            }
        }
        for(int i=0; i<h; i++) {
            String ans = new String(s[i]);
            System.out.println(ans);
        }
    }
}
