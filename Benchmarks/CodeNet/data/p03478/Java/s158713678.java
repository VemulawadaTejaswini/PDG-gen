import java.util.*;

public class Main {
    public static int ans[] ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;

        for(int i=1;i<=n;i++){
            int x = i;
            int c = 0;
            while(x>0){
                c += x%10;
                x /= 10;
            }
            if(a<=c&&c<=b){
                ans += i;
            }
        }

        System.out.println(ans);
    }
}
