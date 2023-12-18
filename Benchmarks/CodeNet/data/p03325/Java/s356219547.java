import java.util.*;

public class Main{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a;

        int ans = 0;

        for(int i=0;i<N;i++){
            a = sc.nextInt();

            while(a%2 == 0){
                a /= 2;
                ans++;
            }
        }


        System.out.println(ans);

    }
}