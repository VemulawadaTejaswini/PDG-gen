import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        String C = scanner.next();
        scanner.close();

        char aLast = A.charAt(A.length() -1);
        char bFirst = B.charAt(0);
        char bLast = B.charAt(B.length() -1);
        char cFirst = C.charAt(0);

        boolean isShiritori = aLast == bFirst && bLast == cFirst;
        System.out.println(isShiritori ? "YES" : "NO");
    }
}
