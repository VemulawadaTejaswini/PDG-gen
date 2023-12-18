import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean[] mochiExists = new boolean[100 + 1];
        for (int i = 0; i < n; i++) {
            mochiExists[sc.nextInt()] = true;
        }
        
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (mochiExists[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}