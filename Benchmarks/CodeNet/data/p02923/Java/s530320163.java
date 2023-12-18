import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] H = new int[N];
        int ans = 0;

        for(int i=0; i<N; i++){
            H[i] = sc.nextInt();
        }
        
        for(int i=0; i<N-1; i++){
            int x = 0;
            for(int j=i; j<N-1; j++){
                if(H[j]>=H[j+1]){
                    x += 1;
                }
                else if(H[j]<H[j+1]){
                    break;
                }
            }
            if(x>ans){
                ans = x;
            }
        }
        System.out.println(ans);
    }
}