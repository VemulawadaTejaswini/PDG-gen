import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();
        int N = sc.nextInt();
        long ans = 0;

        if(D==0){
            ans = 5;
        }
        else if(D==1){
            for(int i=0; i<N; i++){
                ans += 100;
            }
        }
        else{
            for(int i=0; i<N; i++){
                ans += 10000;
            }
        }
        System.out.println(ans);
    }
}