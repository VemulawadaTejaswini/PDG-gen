import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] towns = new int[n];
        
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            towns[a]++;
            towns[b]++;
        }
        
        for (int i : towns) {
            System.out.println(i);
        }
    }
}
