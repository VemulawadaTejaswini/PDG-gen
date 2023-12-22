import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextInt();
        double y = scan.nextInt();
        double x2 = scan.nextInt();
        double y2 =  scan.nextInt();
        double result = Math.sqrt(((x - x2) *(x - x2)) + ((y - y2) * (y - y2)));
        System.out.printf("%.8f",result);
        System.out.println();
    }
}
