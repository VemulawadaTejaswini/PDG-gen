import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int i = s % 100;
        int k = s / 100;
        if (1 <= i && i <= 12 && 1 <= k && k <= 12)
            System.out.println("AMBIGUOUS");
        else if (1 <= i && i <= 12)
            System.out.println("YYMM");
        else if (1 <= k && k <= 12)
            System.out.println("MMYY");
        else
            System.out.println("NA");
    }
}
