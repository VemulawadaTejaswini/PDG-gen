import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(sc.hasNext()) {
            int x = Integer.parseInt(sc.nextLine());
            if (x == 0) {
                break;
            }
            System.out.println("Case " + i++ + ": " + x);
        }
    }
}
