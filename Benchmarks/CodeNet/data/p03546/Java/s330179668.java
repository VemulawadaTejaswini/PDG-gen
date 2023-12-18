import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int[][] score = new int[10][10];
    int[][] input = new int[h][w];
    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                score[i][j] = sc.nextInt();
            }
        }

        floyd();

        Map<Integer, Integer> map = new HashMap<>();

        long ans = 0;

        for (int i=0; i<h; i++) {
            for (int j=0; j<w; j++) {
                int tmp = sc.nextInt();
//                if (tmp>=0) ans += score[tmp][1];
                if (map.containsKey(tmp)) {
                    int val = map.get(tmp);
                    map.put(tmp, val+1);
                } else {
                    map.put(tmp, 1);
                }
            }
        }

//        System.out.println(map);

        for (Integer k: map.keySet()) {
            if (k==-1) continue;
            int val = map.get(k);
            ans += score[k][1] * val;
        }


//        for (int i=0; i<10; i++) {
//            for (int j=0; j<9; j++) {
//                System.out.print(score[i][j]+" ");
//            }
//            System.out.println(score[i][9]);
//        }

        System.out.println(ans);

    }

    void floyd() {
        for (int k=0; k<10; k++) {
            start:
            for (int i=0; i<10; i++) {
                if (score[i][k]==0) continue start;
                end:
                for (int j=0; j<10; j++) {
                    if (score[k][j]==0) continue end;
                    if (i==8 && k==4 && j==9) {
//                        System.out.println(score[i][j]);
//                        System.out.println(score[i][k]);
//                        System.out.println(score[k][j]);
                    }

                    score[i][j] = Math.min(score[i][j], score[i][k] + score[k][j]);
                }
            }
        }
    }

}
