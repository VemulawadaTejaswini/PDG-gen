import java.util.Scanner;

public class Main {

    private static int[] GROUP_1 = { 1, 3, 5, 7, 8, 10, 12 };
    private static int[] GROUP_2 = { 4, 6, 9, 11 };
//    private static int[] GROUP_3 = { 2 };

    public static void main(String[] args) throws Exception {
        try (
            Scanner sc = new Scanner(System.in);
        ) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (
                    (isBelonged(x, GROUP_1) && isBelonged(y, GROUP_1))
                        || (isBelonged(x, GROUP_2) && isBelonged(y, GROUP_2))
            ) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    
    private static boolean isBelonged(int num, int[] group) {
        for (int g : group) {
            if (g == num) {
                return true;
            }
        }
        return false;
    }

}
