import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        String in = sc.next().trim();
        
        if (in.length() <= k) {
            System.out.println(in);
        } else {
            System.out.println(in.substring(0, k) + "...");
        }
    }
}