import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double k = sc.nextInt();
        System.out.println((int) Math.ceil(n / k));
    }


    public static int log2(long x) {
        return (int) (Math.log(x) / Math.log(2));
    }
}
