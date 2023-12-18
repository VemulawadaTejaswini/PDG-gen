import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Codes for input goes here
        int A = scn.nextInt();
        int B = scn.nextInt();
        scn.close();
        B = 2 * B;
        int diff = A - B;
        if(diff<0)
            diff =0;
        System.out.println(diff);

    }
}