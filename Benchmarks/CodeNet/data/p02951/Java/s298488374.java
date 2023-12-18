import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner my_scanner = new Scanner(System.in);
        int A = my_scanner.nextInt();
        int B = my_scanner.nextInt();
        int C = my_scanner.nextInt();
        C = C + B - A;
        System.out.println(C);
    }
}
