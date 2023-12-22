import java.util.ArrayList;
import java.util.Scanner;

class Main {
    ArrayList<Point> pointList = new ArrayList<Point>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    public void run() {
        while (true) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            if (from == 0 && to == 0) {
                break;
            } else {
                pointList.add(new Point(from, to));
            }
        }
        if(isCorrect(pointList)){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }

    }

    boolean isCorrect(ArrayList<Point> plist) {
        int i = 0;
        int[] a = new int[100];
        while (i < plist.size()) {
            int s = plist.get(i).from;
            int e = plist.get(i).to;
            a[s]++;
            a[e]++;
            i++;
        }
        int o = 0;
        for (int hoge : a) {
            if (hoge % 2 == 1) {
                o++;
            }
        }

        if (o != 2) {
            return false;
        } else {
            return true;
        }
    }
}

class Point {

    int from;
    int to;

    Point(int from, int to) {
        this.from = from;
        this.to = to;
    }
}