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
        
        int x = 0;
        for(int i=0; i<N-1; i++){
            if(H[i]>=H[i+1]){
                x += 1;
                if(x>ans){
                    ans = x;
                }
            }
            else if(H[i]<H[i+1]){
                if(x>ans){
                    ans = x;
                }
                    x = 0;
            }
           
        }
        System.out.println(ans);
    }
}