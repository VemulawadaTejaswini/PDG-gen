import java.util.Scanner;

public class Main {
    static int N;
    static int counter = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        permutaion("");
        System.out.println(counter);
        sc.close();
    }

    static void permutaion(String str) {
        if (str.length() > 0 && Long.parseLong(str) > N) {
            return;
        }
        if (!str.matches("[^3]*|[^5]*|[^7]*|.*[^357]+.*")) {
            counter++;
        }
        permutaion(str + "3");
        permutaion(str + "5");
        permutaion(str + "7");
    }
}