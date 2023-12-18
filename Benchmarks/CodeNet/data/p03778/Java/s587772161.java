import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = Math.min(Math.abs(a + w - b), Math.abs(b + w - a));
        System.out.println(Math.abs(a - b) <= w ? 0 : ans);

    }
}
