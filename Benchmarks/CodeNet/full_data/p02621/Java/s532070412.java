import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = (int) (a + Math.pow(a,2) + Math.pow(a,3));
        System.out.println(ans);
    }
}