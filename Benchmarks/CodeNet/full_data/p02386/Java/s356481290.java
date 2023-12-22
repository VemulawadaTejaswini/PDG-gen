import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        int n = Integer.parseInt(sc.next());
        int a[] = new int[6];
        Dice dice[] = new Dice[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                a[j] = Integer.parseInt(sc.next());
            }
            dice[i] = new Dice(a);
        }
        boolean isDifferent = true;
        Outer:
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (dice[i].equals(dice[j])) {
                    isDifferent = false;
                    break Outer;
                }
            }
        }
        out.println(isDifferent ? "Yes" : "No");

        out.flush();
    }
}
class Dice {
    private int top, front, back, left, right, bottom, temp;
    Dice(int[] a) {
        this.top = a[0];
        this.front = a[4];
        this.back = a[1];
        this.left = a[3];
        this.right = a[2];
        this.bottom = a[5];
    }
    void rollWest() {
        this.temp = this.left;
        this.left = this.top;
        this.top = this.right;
        this.right = this.bottom;
        this.bottom = this.temp;
    }
    void rollEast() {
        this.temp = this.right;
        this.right = this.top;
        this.top = this.left;
        this.left = this.bottom;
        this.bottom = this.temp;
    }
    void rollSouth() {
        this.temp = this.back;
        this.back = this.top;
        this.top = this.front;
        this.front = this.bottom;
        this.bottom = this.temp;
    }
    void rollNorth() {
        this.temp = this.front;
        this.front = this.top;
        this.top = this.back;
        this.back = this.bottom;
        this.bottom = this.temp;
    }
    int getTop() {
        return this.top;
    }
    int getFront() {
        return this.front;
    }
    int getBack() {
        return this.back;
    }
    int getRight() {
        return this.right;
    }
    int getLeft() {
        return this.left;
    }
    int getBottom() {
        return this.bottom;
    }
    boolean equals(Dice d) {
        boolean result = false;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.back == d.getBack()) break;
                d.rollSouth();
            }
            d.rollEast();
        }
        for (int i = 0; i < 3; i++) {
            if (this.top == d.getTop()) break;
            d.rollEast();
        }
        if (this.back == d.getBack()
                && this.top == d.getTop()
                && this.right == d.getRight()
                && this.left == d.getLeft()
                && this.front == d.getFront()
                && this.bottom == d.getBottom()) {
            result = true;
        }
        return result;
    }
}
