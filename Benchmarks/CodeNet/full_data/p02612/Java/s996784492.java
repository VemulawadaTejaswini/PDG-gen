import java.util.Scanner;
    public static void main(String[] args) {
        var key = new Scanner(System.in);
        var n = key.nextInt();
        if (n % 1000 == 0) {
            System.out.println(0);
        } else {
            System.out.println(1000-n%1000);
    }
}
