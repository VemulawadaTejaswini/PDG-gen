import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        char[] b = sc.nextLine().toCharArray();
        char[] a = new char[30];
        a['A' - 'A'] = 'T';
        a['C' - 'A'] = 'G';
        a['G' - 'A'] = 'C';
        a['T' - 'A'] = 'A';
        System.out.println(a[b[0] - 'A']);
    }
}