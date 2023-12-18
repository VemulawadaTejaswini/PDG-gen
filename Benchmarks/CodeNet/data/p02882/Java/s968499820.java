import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        double theta ;

        if (x > Math.pow(a, 2) * b / 2) {
        	theta = Math.toDegrees(Math.atan(2 * ( Math.pow(a, 2) * b - x) / Math.pow(a, 3)));
        }else {
        	theta = Math.toDegrees(Math.atan((Math.pow(b, 2) * a) / (2 * x )));
        }


        System.out.println(theta);

    }
}