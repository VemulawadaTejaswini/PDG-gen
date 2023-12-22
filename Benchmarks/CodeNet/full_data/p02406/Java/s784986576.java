import java.util.Scanner;

public class Main {
    int i;
    int n;
    int x;
    public Main(){
        this.n = 0;
        this.i = 1;
        this.x = 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Main problem = new Main();
        problem.call(n);
    }

    public void call(int n) {
        this.n = n;
        checkNum();
        System.out.println();
    }

    public void checkNum() {
        x = i;
        if (x % 3 == 0) {
            System.out.print(" " + i);
            endCheckNum();
        }
        include3();
    }

    public void include3() {
        if (x % 10 == 3 && i <= n) {
            System.out.print(" " + x);
            endCheckNum();
        }
        x /= 10;
        if (x != 0) {
            include3();
        }
        endCheckNum();

    }

    public void endCheckNum() {
        if (++i <= n) {
            checkNum();
        }
    }
}

