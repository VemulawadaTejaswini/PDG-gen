import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int[] c = {1,2,3};
        boolean isOdd = false;
        for (int eachC : c) {
            if ((a * b * eachC) % 2 == 1) {
                isOdd = true;
            }
        }
        if (isOdd) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
