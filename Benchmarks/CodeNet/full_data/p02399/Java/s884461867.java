import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aa = sc.nextInt();
        double bb = sc.nextInt();
        long a = (long)aa;
        long b = (long)bb;
        long d = a / b;
        long r = a % b;
        double f = aa / bb;
        System.out.println(d + " " + r + " " + f);
      }
    }
