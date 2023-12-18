import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        int ans = 1;
        int cnt = 0;
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            if(a[i] == 1){
                ans *= 2;
            }else if(a[i] == 100){
                ans *= 2;
                cnt--;
            }else{
                ans *=3;
            }
            if(a[i]%2 == 0){
                cnt++;
            }
        }
        ans -= (int)Math.pow(2,cnt);
        System.out.println(ans);
    }
}