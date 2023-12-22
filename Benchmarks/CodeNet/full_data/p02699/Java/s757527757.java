import java.util.Scanner;

public class SheepAndWolves {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("S＝");
        int S = Integer.parseInt(scan.next());
        System.out.println("W＝");
        int W = Integer.parseInt(scan.next());

        if (S <= W) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}
