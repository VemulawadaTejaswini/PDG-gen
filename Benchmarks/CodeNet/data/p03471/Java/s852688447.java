import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Y = scan.nextInt();

        int x = Y/10000;
        Y = Y%10000;
        if (Y == 0 && N >= (x)) {
            System.out.println(x +" "+0+" "+0);
            return;
        }
        int y = Y/5000;
        Y = Y%5000;
        if (Y == 0 && N >= (x+y)) {
            System.out.println(x +" "+y+" "+0);
            return;
        }
        int z = Y/1000;
        Y = Y%1000;
        if (Y == 0 && N >= (x+y+z)) {
            System.out.println(x +" "+y+" "+z);
            return;
        } else {
            System.out.println(-1 +" "+-1+" "+-1);
            return;
        }
    }
}