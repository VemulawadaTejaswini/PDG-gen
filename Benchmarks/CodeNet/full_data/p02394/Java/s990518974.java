import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        if ((x-r) < 0 || W < (x+r) || (y-r) < 0 || H < (y+r)) {
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}