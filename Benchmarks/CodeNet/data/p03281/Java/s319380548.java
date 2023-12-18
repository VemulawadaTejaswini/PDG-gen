import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0; 2 * i + 1 <= n; i++)
            count += checkNum(2 * i + 1);
        System.out.println(count);
    }

    public static int checkNum(int n){
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
            if(count > 8)
                return 0;
        }
        if(count == 8)
            return 1;
        else
            return 0;
    }
}
