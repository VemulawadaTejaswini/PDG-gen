import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b%a==0){
            ans = b/a;
        }else {
            ans = b/a+1;
        }
        System.out.println(ans);

    }
}