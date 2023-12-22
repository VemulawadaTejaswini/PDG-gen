import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] map;
    static int[][] label;

    static ArrayList<Integer> ans0;
    static ArrayList<Integer> ans1;

    static int R;
    static int N;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            R = scanner.nextInt();
            if(R == 0)break;
            N = scanner.nextInt();

            int minx = 999999;
            int miny = 999999;
            double mindis = 99999;
            map = new int[21][42];
            for (int i = 0; i < N; i++) {
                int x1 = scanner.nextInt();
                int x2 = scanner.nextInt();
                int h = scanner.nextInt();

                yama(x1, x2, h);
            }

//            for (int i = 0; i < 20; i++) {
//                System.out.print(9);
//            }
//            System.out.println();
//             for (int i = 0; i < 21; i++) {
//                for (int j = 0; j < 42; j++) {
//                    System.out.print(map[i][j]);
//                }
//                System.out.println();
//            }

//            System.out.println(distance(1 , 2));

            for (int i = 20 - R; i < 20 + R; i++) {
                int ok = 0;
                for (int j = 20; j >= 0; j--) {
                    if(map[j][i] == 1){
//                        System.out.println(j);
//                        System.out.println(i - 20 + " " + (j + 1));
//                        System.out.println(i - 19 + " " + (j + 1));
                        if(i != 20 - R && mindis > distance(i - 20, j + 1)){
                            mindis = distance(i - 20, j + 1);
                            minx = i - 20;
                            miny = j + 1;
                        }
                        if(i != 19 + R && mindis > distance(i - 19, j + 1)){
                            mindis = distance(i - 19, j + 1);
                            minx = i - 19;
                            miny = j + 1;
                        }
                        ok = 1;
                        break;
                    }
                }
                if(ok == 0){
//                    System.out.println(i - 20 + " " + 0);
//                    System.out.println(i - 19 + " " + 0);
                    if(mindis > distance(i - 20, 0)){
                        mindis = distance(i - 20, 0);
                        minx = i - 20;
                        miny = 0;
                    }
                    if(mindis > distance(i - 19, 0)){
                        mindis = distance(i - 19, 0);
                        minx = i - 19;
                        miny = 0;
                    }
                }
            }

//            System.out.println(mindis);
//            System.out.println(minx + " " + (miny));
//            System.out.println(((miny + 2) + ((1.0 * minx * minx) / (miny + 2))) - 2);
            System.out.println(R + miny - Math.sqrt(R * R - minx * minx));
//            System.out.println();


//            for (int i = 0; i < 21; i++) {
//                for (int j = 0; j < 42; j++) {
//                    System.out.print(map[i][j]);
//                }
//                System.out.println();
//            }





        }
    }

    static double distance(int x, int y){

        return (y + R) * (y + R) + x * x;
    }

    static void yama(int x1, int x2, int h){

        for (int i = x1 + 20; i < x2 + 20; i++) {
            for (int j = 0; j < h; j++) {
                map[j][i] = 1;
            }
        }

    }



}

