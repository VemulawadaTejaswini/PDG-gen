import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int top;
    public static int prev;
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        Dice dice = new Dice(a, b, c, d, e, f);
        
        int i = sc.nextInt();

        while (sc.hasNext()) {
            top = sc.nextInt();
            prev = sc.nextInt();
            rotate(dice, 0);
        }
    }
    
    public static void rotate(Dice dice, int num) {
        num++;
        if (num > 3) return;
        String[] dir = {"N", "S", "E", "W"};
        for (int i = 0; i < dir.length; i++) {
            dice.move(dir[i]);
            if (dice.ary[0] == top && dice.ary[1] == prev) {
                System.out.println(dice.ary[2]);
                dice.set(a,b,c,d,e,f);
                return;
            } else {
                rotate(dice, num);
            }
        }
    }
}

class Dice {
    public int[] ary;
    public Point p;
    public Dice(int a, int b, int c, int d, int e, int f) {
        ary = new int[6];
        ary[0] = a;
        ary[1] = b;
        ary[2] = c;
        ary[3] = d;
        ary[4] = e;
        ary[5] = f;
        p = new Point();
    }
    
    public void set(int a, int b, int c, int d, int e, int f) {
        ary[0] = a;
        ary[1] = b;
        ary[2] = c;
        ary[3] = d;
        ary[4] = e;
        ary[5] = f;
    }
    
    public void move(String s) {
        int t;
        switch(s) {
        case "N":
            t = ary[0];
            ary[0] = ary[1];
            ary[1] = ary[5];
            ary[5] = ary[4];
            ary[4] = t;
            p.y++;
            break;
        case "S":
            t = ary[0];
            ary[0] = ary[4];
            ary[4] = ary[5];
            ary[5] = ary[1];
            ary[1] = t;
            p.y--;
            break;
        case "E":
            t = ary[0];
            ary[0] = ary[3];
            ary[3] = ary[5];
            ary[5] = ary[2];
            ary[2] = t;
            p.x++;
            break;
        case "W":
            t = ary[0];
            ary[0] = ary[2];
            ary[2] = ary[5];
            ary[5] = ary[3];
            ary[3] = t;
            p.x--;
            break;
        }
    }
    public void showTop() {
        System.out.println(ary[0]);
    }
    public void showRight() {
        System.out.println(ary[2]);
    }
}

class Point {
    public int x;
    public int y;

    public Point() {
        x = 0;
        y = 0;
    }
}