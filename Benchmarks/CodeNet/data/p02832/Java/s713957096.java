import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int ans = 0;
        boolean test = false;
        
        for(int i=0; i<N; i++){
            int A = sc.nextInt();
            if(A==1){
                test = true;
            }
            if(count==A){
                count++;
            }else{
                ans++;
            }
        }
        if(test){
            System.out.println(ans);
        }else{
            System.out.println(-1);
        }
    }
}