import java.util.*;

    class xyh {
         int x;
         int y;
         int h;
        xyh(int x, int y, int h) {
            this.x = x;
            this.y = y;
            this.h = h;
        } 

        int getX() {return x;}
        int getY() {return y;}
        int getH() {return h;}
     }

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        int resultx = 0;
        int resulty = 0;
        List<xyh> list = new ArrayList<>();
        for (int i = 0; i<N; i++) {
            list.add(new xyh(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }

        for (int x=0; x <= 100; x++) {
            for (int y=0; y <= 100; y++) {
                int estimationH = judge(x, y, list);
                if (estimationH > 0) {
                    result = estimationH;
                    resultx = x;
                    resulty = y;
                }
            }
        }

        System.out.println(resultx + " " + resulty + " " + result);
    }

    public static int judge(int x, int y, List<xyh> list) {
        int[] level = new int[100];
        for (int i = 0; i<100; i++) {
            level[i] = -1;
        }

        int refH = -1;
        for(xyh l : list) {
            int estimationDiff = Math.abs(x - l.getX()) + Math.abs(y - l.getY());
            int estimationH = l.getH() + estimationDiff;
            if (refH < 0) {
                refH = estimationH;
            }
            else if (refH != estimationH) {
                return -1;
            }
        }

        return refH;
    }

    public static boolean calcHight(int x, int y, List<xyh> list) {
        return true;
    }

}