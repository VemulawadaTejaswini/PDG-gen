import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[]  l = new int[n+1];
        l[0]=0;
        for(int i=0;i<n;i++){
            l[i+1]= sc.nextInt();
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            if(l[i]<=n){
                ans++;
            }
        }
        System.out.println(ans);
    }
}