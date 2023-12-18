import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static class pair {
            public int a;
            public int b;

            pair(){
                this.a = 0;
                this.b = 0;
            }

            pair(int a, int b){
                this.a = a;
                this.b = b;
            }

            public void set(int a, int b) {
                this.a = a;
                this.b = b;
            }
        }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int D = scanner.nextInt();

        pair[] map = new pair[H * W];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                map[Integer.parseInt(scanner.next()) - 1] = new pair(j ,i);
            }
        }



        int[][] point  = new int[D][H * W / D + 1];

        for (int i = 0; i < D; i++) {
            int j = 1;
            point[i][0] = 0;
            while (j * D + i < H * W){
//                System.out.println(j * D + i);
                point[i][j] = point[i][j - 1] + Math.abs(map[j * D + i].a - map[(j - 1) * D + i].a) + Math.abs(map[j * D + i].b - map[(j - 1) * D + i].b);
                j++;
            }

        }

        int Q = scanner.nextInt();


//        for (int i = 0; i < D; i++) {
//            for (int j = 0; j <= H * W / D; j++) {
//                System.out.print(point[i][j] + " ");
//            }
//            System.out.println();
//        }


        for (int i = 0; i < Q; i++) {
            int L = scanner.nextInt();
            int R = scanner.nextInt();

            int aa = R % D == 0 ? 1 : 0;
            System.out.println(point[(R + D - 1) % D][(R - aa) / D] - point[(R + D - 1) % D][(L - aa) / D]);
//            System.out.println(point[(R + D - 1) % D][(L - aa) / D]);
        }


    }



}


