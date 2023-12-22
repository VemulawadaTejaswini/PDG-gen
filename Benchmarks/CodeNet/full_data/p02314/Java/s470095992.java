import java.util.Scanner;

class Main {

    int size;
    int cs;
    int[] coins;

    int min = 999999;

    public void go() {
        Scanner sc = new Scanner(System.in);
        this.size = sc.nextInt();
        this.cs = sc.nextInt();
        this.coins = new int[cs];
        for (int i = 0; i < this.coins.length; i++) {
            this.coins[i] = sc.nextInt();
        }
        this.calc(0, this.size);
        System.out.println(this.min);
    }

    public void calc(int count, int remain) {
        if (this.min <= count) {
            return;
        }
        if (remain == 0) {
            if (count < this.min) {
                this.min = count;
            }
        } else {
            for (int c : coins) {
                if (c <= remain) {
                    this.calc(count + 1, remain - c);
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.go();
    }
}
