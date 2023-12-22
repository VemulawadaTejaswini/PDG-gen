import java.util.Scanner;

public class Main {
        static final char APPLE = '@';
        static final int KAKI = '#';
        static final int ORANGE = '*';
        static final int SEARCHED = '0';

        char field[][];
        int cnt = 0;
        int H;
        int W;

        public static void main(String args[]) {
                new Main().run();
        }
        void run() {
                Scanner scan = new Scanner(System.in);
                while(true){
                        H = scan.nextInt();
                        W = scan.nextInt();
                        if (H == 0 && W == 0)
                                return;

                        field = new char[H][W];
                        String input;
                        for (int i = 0; i < H; i++) {
                                input = scan.next();
                                for (int j = 0;j < W; j++) {
                                        field[i][j] = input.charAt(j);
                                }
                        }

                        for (int i = 0; i < H; i++) {
                                for (int j = 0; j < W; j++) {
                                        if (field[i][j] != SEARCHED) {
                                                cnt++;
                                                search(i,j,field[i][j]);
                                        }
                                }
                        }
                        System.out.println(cnt);
                }
        }

        void search(int x, int y, char fruit) {
                if (x < 0 || y < 0 || x >= H || y >= W)
                        return;
                if (field[x][y] != SEARCHED && field[x][y] == fruit){
                        field[x][y] = SEARCHED;
                        search(x - 1, y, fruit);
                        search(x + 1, y, fruit);
                        search(x, y - 1, fruit);
                        search(x, y + 1, fruit);
                }
        }
}