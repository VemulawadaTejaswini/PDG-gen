import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = 0;
        int f = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(a % 4 == 0) f++;
            else if(a % 2 != 0)  z++;
        }
        if(f >= z || (f + 1 == z && f + z == n)) System.out.println("Yes");
        else System.out.println("No");

        sc.close();
    }

}
