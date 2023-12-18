import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        // ABC150A - 500 Yen Coins
 
        Scanner sc = new Scanner(System.in);
 
        int k = sc.nextInt();
        int x = sc.nextInt();

        System.out.println(k * 500 < x ? "No" : "Yes");
    }
}