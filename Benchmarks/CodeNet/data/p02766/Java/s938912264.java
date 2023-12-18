import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = Integer.parseInt(stdIn.next());
        int k = Integer.parseInt(stdIn.next());

        int x = 1;
        int r = 0;
        while (true) {
            if (n < x) {
                System.out.println(r);
                break;
            }
            x *= k;
            r++;
        }
    }
}