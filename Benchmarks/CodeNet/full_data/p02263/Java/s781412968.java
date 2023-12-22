import java.util.Scanner;

public class Main {

    int current = 0;
    int[] stack = new int[101];

    public void go() {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] strs = line.split(" ");
        for (String str : strs) {
            char ch = str.charAt(0);
            if ('0' <= ch && ch <= '9') {
                this.stack[this.current] = Integer.parseInt(str);
                this.current++;
            } else {
                switch (ch) {
                case '+':
                    this.stack[current - 2] += this.stack[current - 1];
                    this.stack[current] = 0;
                    this.current--;
                    break;
                case '-':
                    this.stack[current - 2] -= this.stack[current - 1];
                    this.stack[current] = 0;
                    this.current--;
                    break;
                case '*':
                    this.stack[current - 2] *= this.stack[current - 1];
                    this.stack[current] = 0;
                    this.current--;
                    break;
                }
            }
        }
        sc.close();
        System.out.println(this.stack[current - 1]);
    }

    public static void main(String[] args) {
        Main cui = new Main();
        cui.go();
    }
}
