
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO 自動生成されたメソッド・スタ
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] a = new int[6];

        for (int i = 0; i < s.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        Dices dices = new Dices(a);

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] TopFront = br.readLine().split(" ");
            int top = Integer.parseInt(TopFront[0]);
            int front = Integer.parseInt(TopFront[1]);
            dices.setTop(top);
            dices.setFront(front);
            System.out.println(dices.RIGHT);
        }
    }
}

class Dices {
    int TOP, BOTTOM, LEFT, RIGHT, FRONT, BACK;

    Dices(int[] a) {
        this.TOP = a[0];
        this.FRONT = a[1];
        this.RIGHT = a[2];
        this.LEFT = a[3];
        this.BACK = a[4];
        this.BOTTOM = a[5];
    }

    void setTop(int top) {
        if (this.FRONT == top)
            this.turnN();
        else if (this.RIGHT == top)
            this.turnW();
        else if (this.LEFT == top)
            this.turnE();
        else if (this.BACK == top)
            this.turnS();
        else if (this.BOTTOM == top) {
            this.turnN();
            this.turnN();
        }
    }

    void setFront(int front) {
        if (this.RIGHT == front)
            this.turnL();
        else if (this.LEFT == front)
            this.turnR();
        else if (this.BACK == front) {
            this.turnR();
            this.turnR();
        }
    }

    void turnS() {
        int tmp = this.TOP;
        this.TOP = this.BACK;
        this.BACK = this.BOTTOM;
        this.BOTTOM = this.FRONT;
        this.FRONT = tmp;
    }

    void turnN() {
        int tmp = this.TOP;
        this.TOP = this.FRONT;
        this.FRONT = this.BOTTOM;
        this.BOTTOM = this.BACK;
        this.BACK = tmp;
    }

    void turnW() {
        int tmp = this.TOP;
        this.TOP = this.RIGHT;
        this.RIGHT = this.BOTTOM;
        this.BOTTOM = this.LEFT;
        this.LEFT = tmp;
    }

    void turnE() {
        int tmp = this.TOP;
        this.TOP = this.LEFT;
        this.LEFT = this.BOTTOM;
        this.BOTTOM = this.RIGHT;
        this.RIGHT = tmp;
    }

    void turnL() {
        int tmp = this.FRONT;
        this.FRONT = this.RIGHT;
        this.RIGHT = this.BACK;
        this.BACK = this.LEFT;
        this.LEFT = tmp;
    }

    void turnR() {
        int tmp = this.FRONT;
        this.FRONT = this.LEFT;
        this.LEFT = this.BACK;
        this.BACK = this.RIGHT;
        this.RIGHT = tmp;
    }

}

