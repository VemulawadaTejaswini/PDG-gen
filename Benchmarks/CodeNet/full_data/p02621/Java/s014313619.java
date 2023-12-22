import java.util.Scanner;

class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int a = scan.nextInt();
        System.out.println(equationOutput(a));
    }

    private static int equationOutput(int a) {
        int gp =  a * ((int)Math.pow(a, 3) - 1) / (a - 1);
        return gp;
    }
}
