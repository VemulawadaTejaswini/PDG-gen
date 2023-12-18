import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        String[] s = sc.nextLine().split(" ");
        boolean ok = true;
        for (String s1 : s) {
            int a = Integer.parseInt(s1);
            if(a % 2 == 0 ) {
                if (a % 3 == 0 || a % 5 == 0){
                    ok = true;
                } else {
                    ok = false;
                    break;
                }
            }
        }
        if (ok) {
            System.out.println("APPROVED");
        } else {
            System.out.println("DENIED");
        }
    }
}
