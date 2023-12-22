import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), f = sc.nextInt(), r = sc.nextInt();
        while (!(m == -1 && f == -1 && r == -1)) {
            int sum = m + f;
            if (m == -1 || f == -1) System.out.println('F');
            else if(sum >= 80) System.out.println('A');
            else if(sum >= 65 && sum < 80) System.out.println('B');
            else if((sum >= 50 && sum < 65) || (sum >= 30 && sum < 50 && r >= 50)) System.out.println('C');
            else if(sum >= 30 && sum < 50) System.out.println('D');
            else System.out.println('F');
            m = sc.nextInt();
            f = sc.nextInt();
            r = sc.nextInt();
        }
    }
}

