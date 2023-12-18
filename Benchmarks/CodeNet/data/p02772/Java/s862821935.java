import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isOK = true;
        ArrayList<int> list = new ArrayList<int>();
        for(i = 0; i <= n; i++) {
            int checking = sc.nextInt();
            if (!((checking % 3 == 0) || (checking % 5 == 0))) {
                isOK = false;
            }
        }
        if (isOK) {
            System.out.println("APPROVED");
        } else {
            System.out.println("DENIED");
        }
    }
}