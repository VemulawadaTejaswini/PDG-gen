import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s;
        boolean isAns = false;
        for (int i = 0; i< n; i++) {
            s = sc.next();
            if (s.equals("Y")) {
                isAns = true;
                break;
            }
        }

        System.out.println(isAns ? "Four" : "Three");
    }
}
