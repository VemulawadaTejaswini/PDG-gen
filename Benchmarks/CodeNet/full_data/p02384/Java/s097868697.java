import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Dice {
    int top;
    int bottom;
    int left;
    int right;
    int front;
    int back;

    static Dice of (int[] init) {
        Dice d = new Dice();
        // [top front right left back bottom]
        d.top = init[0];
        d.bottom = init[5];
        d.left = init[3];
        d.right = init[2];
        d.front = init[1];
        d.back = init[4];
        return d;
    }

    static Dice of (Dice copy) {
        Dice d = new Dice();
        d.top = copy.top;
        d.bottom = copy.bottom;
        d.left = copy.left;
        d.right = copy.right;
        d.front = copy.front;
        d.back = copy.back;
        return d;
    }

    // roll to right
    void E () {
        Dice copy = Dice.of(this);
        top = copy.left;
        bottom = copy.right;
        left = copy.bottom;
        right = copy.top;
    }

    // roll to back
    void N () {
        Dice c = Dice.of(this);
        top = c.front;
        bottom = c.back;
        front = c.bottom;
        back = c.top;
    }

    // roll to front
    void S () {
        Dice c = Dice.of(this);
        top = c.back;
        bottom = c.front;
        front = c.top;
        back = c.bottom;
    }

    // roll to left
    void W () {
        Dice c = Dice.of(this);
        top = c.right;
        bottom = c.left;
        left = c.top;
        right = c.bottom;
    }

    void toTop (int n) {
        if (n == bottom) {
            E();
            E();
        } else if (n == left) {
            E();
        } else if (n == right) {
            W();
        } else if (n == front) {
            N();
        } else if (n == back) {
            S();
        }
    }

    void toFront (int n) {
        if (n == top) {
            S();
        } else if (n == bottom) {
            N();
        } else if (n == left) {
            E();
            S();
        } else if (n == right) {
            W();
            S();
        } else if (n == back) {
            S();
            S();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
            int[] arr = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Dice dice = Dice.of(arr);

            int n = Integer.parseInt(in.readLine());
            for (int i = 0; i < n; i++) {
                String[] line = in.readLine().split(" ");
                int top = Integer.parseInt(line[0]);
                int front = Integer.parseInt(line[1]);
                while (true) {
                    if (dice.top == top && dice.front == front) break;
                    dice.toTop(top);
                    if (dice.top == top && dice.front == front) break;
                    dice.toFront(front);
                }
                System.out.println(dice.right);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

