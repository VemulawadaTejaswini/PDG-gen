import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        for (int i=k;i<=n+1;i++){
            ans=((((n-i+1)*(long)i)+1)+ans)%1000000007;
        }
        System.out.println(ans);
    }
}
