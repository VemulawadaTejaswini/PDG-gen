import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 2;

        for(int i=0; i<N; i++){
            if(N/K>=K){
                ans += 1;
                N = (int)N/K;
            }
            else if(N<K){
                break;
            }
        }
        System.out.println(ans);
    }
}