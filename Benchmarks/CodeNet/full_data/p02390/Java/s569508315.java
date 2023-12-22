import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = n/3600;
        int m = (n%3600)/60;
        int s = (n%3600)%60;
        System.out.printf("%d:%d:%d\n", h, m, s);

    }
}

