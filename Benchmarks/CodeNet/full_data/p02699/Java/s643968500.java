import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int S = sc.nextInt();
            int W = sc.nextInt();
            System.out.println(W >= S ? "unsafe" : "safe");
        }
    }
}
