import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        long s = sc.nextLong();
        if(t * s < n)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}