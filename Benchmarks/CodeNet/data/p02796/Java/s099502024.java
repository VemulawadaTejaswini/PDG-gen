//package unk;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sguar <shugangcao@gmail.com>
 * welcome to kuaishou
 * Created on 2020-01-10
 */
public class Main {

    public void run() {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        Point[] list = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = cin.nextInt();
            int l = cin.nextInt();
            list[i] = new Point(x, l);
        }
        Arrays.sort(list);
        //debug(list);
        int ans = 1;
        Point last = list[0];
        for (int i = 1; i < n; i++) {
            if (list[i].getX() < last.getY()) {

            } else {
                ans++;
                last = list[i];
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new Main().run();
    }

    private void debug(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
        }
    }
    class Point implements Comparable<Point>{
        int x;
        int y;
        int l;
        public Point(int xi, int l) {
            this.x = xi - l;
            this.y = xi + l;
            this.l = l;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getL() {
            return l;
        }

        @Override
        public int compareTo(Point o) {
            if (o.y == this.y) {
                return this.x - o.x;
            }
            return this.y - o.y;
        }

        @Override
        public String toString() {
            return "x:" + x + ",y:" + y;
        }
    }
}
