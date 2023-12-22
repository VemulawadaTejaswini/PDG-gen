import java.util.Scanner;

class Main{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int a = scan.nextInt();
        System.out.println(equationOutput(a));
    }

    private static long equationOutput(int a) {
        if(a == 0) {
            return 0;
        }
        long gp =  a * ((long)Math.pow(a, 3) - 1) / (a - 1);
        return gp;
    }
}
