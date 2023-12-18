import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int max = 0;
        int ans = 0;
        int tmp = 0;
        for(int i = 0;i<n;i++){
            tmp = sc.nextInt();
            sc.nextLine();
            ans += tmp;
            if(tmp >max){
                max = tmp;
            }
        }
        ans -= tmp/2;
        System.out.println(ans);
    }
}