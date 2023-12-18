import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        String[] a = new String[N];

        for(int i=0; i<N; i++){
            a[i] = sc.next();
        }
        String[] ans = new String[N];
        for(int i=0; i<N/2; i++){
            if(N%2==0){
                ans[N / 2 + i] = a[2 * i];
                ans[N / 2 - i - 1] = a[2 * i + 1];
            }
            else{
                ans[N / 2 - i] = a[2 * i];
                ans[N / 2 + 1 + i] = a[2 * i + 1];
                if(i==N/2-1){
                    ans[0] = a[N - 1];
                }
            }
        }
        for(int i=0; i<N; i++){
            if(i==0){
                System.out.print(ans[i]);
            }
            else{
                System.out.print(" " + ans[i]);
            }
        }
    }
}