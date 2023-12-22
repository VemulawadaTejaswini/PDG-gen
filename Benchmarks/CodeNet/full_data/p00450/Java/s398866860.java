import java.io.*;
import java.util.*;

class Range {
    public int from, to;
    public int color;
    Range(int from, int to, int color) {
        this.from = from;
        this.to = to;
        this.color = color;
    }
    @Override
    public String toString() {
        return "color: " + color + ", " + "from " + from + " to " + to;
    }
}

public class Main {
    Scanner sc;
    Stack<Range> stack;
    int n;

    Main() {
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new Main().run();
    }

    boolean init() {
        n = sc.nextInt();
        if (n == 0) return false;
        stack = new Stack<Range>();
        stack.push(new Range(1, 1, 0));
        return true;
    }

    void run() {
        while (init()) {
            int color;
            for (int i = 1; i <= n; i++) {
                color = sc.nextInt();
                if (i % 2 == 1) {
                    if (stack.peek().color == color) {
                        stack.peek().to++;
                    } else {
                        stack.push(new Range(i, i+1, color));
                    }
                } else {
                    if (stack.peek().color == color) {
                        stack.peek().to++;
                    } else {
                        Range r = stack.pop();
                        if (stack.empty()) {
                            r.to++;
                            stack.push(r);
                        } else {
                            stack.peek().to = r.to+1;
                        }
                    }
                }
            }
            int count = 0;
            for (Range r : stack) {
//                System.out.println(r);
                if (r.color == 0) {
                    count += (r.to - r.from);
                }
            }

            System.out.println(count);
        }
    }
}