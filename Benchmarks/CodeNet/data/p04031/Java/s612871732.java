import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int[] a = new int[N];
        int sum = 0;

        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }

        int h = 0;
        if(sum%N==0){
            h = sum / N;
        }
        else{
            if(sum%N<=(double)N/2){
                h = sum / N;
            }
            else{
                h = sum / N + 1;
            }
        }
        int ans = 0;
        for(int i=0; i<N; i++){
            ans += (a[i] - h) * (a[i] - h);
        }
        System.out.println(ans);
    }
}