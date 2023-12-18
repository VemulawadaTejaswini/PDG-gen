import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i = 0; i <= n; i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        int monster = 0;
        for(int i = n-1; i >= 0; i--){
            if(a[i+1] >= b[i]){
                monster += b[i];
            }else{
                monster += a[i+1];
                b[i] -= a[i+1];
                if(b[i] >= a[i]){
                    monster += a[i];
                    a[i] = 0;
                }else{
                    monster += b[i];
                    a[i] -= b[i];
                }
            }
        }
        System.out.println(monster);
    }
}