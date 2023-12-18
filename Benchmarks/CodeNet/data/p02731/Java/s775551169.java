import java.util.*;

public class Main {
    public static void main(String [] args)
    {
        int l;
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        long ans = (long)(l)/(long)(3);
        System.out.print(Math.pow(ans,3));
    }
}
