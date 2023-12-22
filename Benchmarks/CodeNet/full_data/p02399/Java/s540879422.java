import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int d = (int)a / (int)b;
        int r = (int)a % (int)b;
        double f = a/b;
        System.out.println(d + " " + r + " " + String.format("%.5f", f));
    }
}

