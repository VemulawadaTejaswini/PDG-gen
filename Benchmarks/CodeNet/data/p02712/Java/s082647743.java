import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0)
                continue;
            if (i % 5 == 0)
                continue;
            sum += (long) i;
        }
        System.out.println(sum);
    }

}
