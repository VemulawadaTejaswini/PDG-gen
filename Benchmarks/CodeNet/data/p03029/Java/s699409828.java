import java.util.Scanner;

class Main {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int p = scan.nextInt();
        int piece = (a*3) + p;
        System.out.println(piece/2);
    }

}
