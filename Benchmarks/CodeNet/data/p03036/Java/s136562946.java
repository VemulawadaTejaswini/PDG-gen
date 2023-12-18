import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r,D,x;

        r = sc.nextInt();
        D = sc.nextInt();
        x = sc.nextInt();

        for(int i = 0;i < 10; i++) {
            x = r*x - D;
            System.out.println(x);
        }
    }
}