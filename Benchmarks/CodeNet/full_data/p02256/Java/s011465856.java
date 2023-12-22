import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        long x, y, r, temp;

        x = stdIn.nextLong();
        y = stdIn.nextLong();

        if (x < y) {
            temp = x;
            x = y;
            y = temp;
        }

        while((r = x % y) != 0) {
            x = y;
            y = r;
        }
        System.out.println(y);
    }
}


