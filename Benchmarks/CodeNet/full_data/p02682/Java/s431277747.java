import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        int A = sn.nextInt();
        int B = sn.nextInt();
        int C = sn.nextInt();
        int K = sn.nextInt();
        int flag = 1;
        int ans = 0;

        for(int i=0; i<A; i++){
            if(K == 0) {
                break;
            }
            ans = ans + 1;
            K = K - 1;
        }

        for(int i=0; i<B; i++){
            if(K == 0) {
                break;
            }
            K = K - 1;
        }

        for(int i=0; i<C; i++){
            if(K == 0) {
                break;
            }
            ans = ans - 1;
            K = K - 1;
        }

        System.out.println(ans);

    }
}