import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int pow = (int)Math.pow(2,m);
        System.out.println((m*1900+(n-m)*100)*pow);
    }
}