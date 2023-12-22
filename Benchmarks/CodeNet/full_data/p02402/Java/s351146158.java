import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Long> list = new ArrayList<Long>();
        long input = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            input = scan.nextLong();
            sum += input;
            list.add(input);
        }
        Collections.sort(list);
        System.out.println(list.get(0) + " " + list.get(n-1) + " " + sum);
    }
}