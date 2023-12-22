import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                double A = scan.nextInt();
                double B = scan.nextInt();
                double H = scan.nextInt();
                double M = scan.nextInt();

                System.out.println(
                		Math.sqrt(
                		Math.pow(
                				B*Math.cos(Math.toRadians((180-11*M+60*H)/2))
                				, 2) +
                		Math.pow(
                				B*Math.sin(Math.toRadians((180-11*M+60*H)/2)) - A
                				, 2)
                		)
                	);
        }
}