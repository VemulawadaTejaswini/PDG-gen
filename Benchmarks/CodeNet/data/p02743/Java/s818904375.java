import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        double AA = Math.sqrt((double)A);
        double BB = Math.sqrt((double)B);
        double CC = Math.sqrt((double)C);
        if ((AA + BB) < CC) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}