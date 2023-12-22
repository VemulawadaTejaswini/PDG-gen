import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        int h = scanner.nextInt();
        int m = scanner.nextInt();

//        角度を求める
        int angle = (h * 30) - ( m * 6 );
        if( angle < 0) {
            angle = -(angle);
        }else{
          angle = angle;
        }

        double before = Math.sqrt(Math.pow(a,2) + Math.pow(b,2) 
                                  - 2 * a * b * Math.cos(Math.toRadians(angle)));
        String after = String.format("%.20f", before);
        System.out.println(after);

        scanner.close();
    }

}