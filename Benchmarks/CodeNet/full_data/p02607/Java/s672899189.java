import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(i % 2 == 0 && a % 2 == 1){
                ans++;
            }
        }

        System.out.print(ans);

    }
}
