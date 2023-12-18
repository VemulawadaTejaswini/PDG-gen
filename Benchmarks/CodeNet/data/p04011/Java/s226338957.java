import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int numOfStay = sc.nextInt();
        int maxDays = sc.nextInt();
        int cost1 = sc.nextInt();
        int cost2 = sc.nextInt();
        
        if (numOfStay > maxDays) {
            System.out.println(maxDays * cost1 + (numOfStay - maxDays) * cost2);
        } else {
            System.out.println(numOfStay * cost1);
        }
    }
}