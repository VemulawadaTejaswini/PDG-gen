import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        int factor = scan.nextInt();
        int minDist = scan.nextInt();
        int maxDist = scan.nextInt();

        for(int i = minDist; i <= maxDist; ++i) {
            if(i % factor == 0) {
                System.out.println("OK");
                scan.close();
                return;
            }
        }
        System.out.println("NG");
        scan.close();
        return;
    }
}