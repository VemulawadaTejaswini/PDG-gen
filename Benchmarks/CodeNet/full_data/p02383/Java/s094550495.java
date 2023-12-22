import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
//        sc.useDelimiter(",");
//        DecimalFormat df = new DecimalFormat("0.00000000");
        int a[] = new int[6];
        for (int i = 0; i < 6; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        Dice d = new Dice(a);
        char[] orders = sc.next().toCharArray();
        for (int i = 0; i < orders.length; i++) {
//            out.println(d.getTop());
            switch (orders[i]) {
                case 'E':
                    d.rollEast();
                    break;
                case 'W':
                    d.rollWest();
                    break;
                case 'S':
                    d.rollSouth();
                    break;
                case 'N':
                    d.rollNorth();
                    break;
                default:
                    out.println("Error!");
                    break;
            }
        }
        out.println(d.getTop());
        out.flush();
    }
}
class Dice {
    private int top, front, back, left, right, down, temp;
    Dice(int[] a) {
        this.top = a[0];
        this.front = a[4];
        this.back = a[1];
        this.left = a[3];
        this.right = a[2];
        this.down = a[5];
    }
    void rollWest() {
        this.temp = this.left;
        this.left = this.top;
        this.top = this.right;
        this.right = this.down;
        this.down = this.temp;
    }
    void rollEast() {
        this.temp = this.right;
        this.right = this.top;
        this.top = this.left;
        this.left = this.down;
        this.down = this.temp;
    }
    void rollSouth() {
        this.temp = this.back;
        this.back = this.top;
        this.top = this.front;
        this.front = this.down;
        this.down = this.temp;
    }
    void rollNorth() {
        this.temp = this.front;
        this.front = this.top;
        this.top = this.back;
        this.back = this.down;
        this.down = this.temp;
    }
    int getTop() {
        return this.top;
    }
}
