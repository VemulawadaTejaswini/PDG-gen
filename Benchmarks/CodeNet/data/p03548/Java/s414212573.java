import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        int cnt = 0;
        if (x >= z)
            x -= z;
        
        while (x >= y+z) {
            cnt++;
            x -= (y + z);
        }

        System.out.println(cnt);
    }
}