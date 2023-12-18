import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //int[] nums = new int[n];
        for (int i = 0; i < n; i ++){
            int t = scan.nextInt();
            if (t % 2 == 0 && t % 3 != 0 && t % 5 != 0) {
                System.out.println("DENIED");
                return;
            }
        }
        System.out.println("APPROVED");
    }
}
