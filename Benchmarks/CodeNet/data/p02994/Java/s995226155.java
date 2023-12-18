import java.util.*;

public class Main {

    public static void main(String[] args){

        // i = abs(1 - L)


        int n, l;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        l = sc.nextInt();

        int ans = 0;
        boolean isRejected = false;
        for(int i = 1; i <= n; i++){
            if(i == Math.abs(1 - l)){
                isRejected = true;
                continue;
            } else {
                ans += l + i - 1;
            }
        }
        if(!isRejected){
            if(l < 0) {
                ans -= l + n - 1;
            } else{
                ans -= l;
            }
        }
        System.out.println(ans);
        return;
    }
}
