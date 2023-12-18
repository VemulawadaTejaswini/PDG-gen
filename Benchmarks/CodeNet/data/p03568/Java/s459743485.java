import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        int ans = (int)Math.pow(3,N);
        int cnt = 0;
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            if(a[i] == 1){
                ans--;
            }else if(a[i] == 100){
                ans--;
                cnt--;
            }
            if(a[i]%2 == 0){
                cnt++;
            }
        }
        ans -= (int)Math.pow(2,cnt);
        System.out.println(ans);
    }
}