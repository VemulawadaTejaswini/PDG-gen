import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum1= n*(n-1)/2;
        int sum2 = m*(m-1)/2;
        System.out.println(sum1+sum2);
    }
}
