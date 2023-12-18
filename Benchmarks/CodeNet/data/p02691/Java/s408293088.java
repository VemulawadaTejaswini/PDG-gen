import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n+1];
        for(int i = 1; i <= n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        int ans = 0;
        for(int i = 1; i <= n; i++){
            for(int j = i+a[i]+1; j <= n; j++){
                if(a[i] + a[j] == j-i){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}