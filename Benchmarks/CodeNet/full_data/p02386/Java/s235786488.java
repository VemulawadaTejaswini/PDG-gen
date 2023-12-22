
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // TODO 自動生成されたメソッド・スタ
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Dice4[] dice = new Dice4[n];

        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");
            int[] input = new int[6];
            for (int j = 0; j < 6; j++) {
                input[j] = Integer.parseInt(inputs[j]);
            }
            dice[i] = new Dice4(input);
        }
        boolean result = false;
        outer: for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if(dice[i].superEquals(dice[j])){
                    result = true;
                    break outer;
                }
            }
        }
        if(result){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

    }

}

class Dice4 {
    int TOP, BOTTOM, LEFT, RIGHT, FRONT, BACK;

    Dice4(int[] a) {
        this.TOP = a[0];
        this.FRONT = a[1];
        this.RIGHT = a[2];
        this.LEFT = a[3];
        this.BACK = a[4];
        this.BOTTOM = a[5];
    }

    public boolean superEquals(Dice4 another) {
        Dice4 tmp = another;

        while (true) {
            if (this.equalsMethod(tmp)) {
                break;
            }
            tmp.turnN();
            if (this.equalsMethod(tmp)) {
                break;
            }
            tmp.turnN();
            if (this.equalsMethod(tmp)) {
                break;
            }
            tmp.turnN();
            if (this.equalsMethod(tmp)) {
                break;
            }
            tmp.turnW();
            if (this.equalsMethod(tmp)) {
                break;
            }
            tmp.turnE();
            tmp.turnE();
            if (this.equalsMethod(tmp)) {
                break;
            }
            return false;
        }
        return true;
    }

    boolean equalsMethod(Dice4 another) {
        Dice4 tmp = another;
        if (this.TOP == tmp.TOP) {
            if (this.BOTTOM == tmp.BOTTOM) {
                for (int i = 0; i < 4; i++) {
                    if (this.checkSides(tmp)) {
                        return true;
                    }
                    tmp.turnR();
                }
            }
        }
        return false;
    }

    boolean checkSides(Dice4 another) {
        // TODO 自動生成されたメソッド・スタブ
        return this.FRONT == another.FRONT && this.RIGHT == another.RIGHT && this.LEFT == another.LEFT
                && this.BACK == another.BACK;
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
