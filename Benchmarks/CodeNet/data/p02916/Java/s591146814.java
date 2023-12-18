
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n - 1];
        int f = 0;
        for(int i = 1;i <= n;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            for(int d = 1;d <= n;d++){
                if(a[i] == a[d] + 1){
                    f = b[a[i]] + c[i];
                } else {
                    f = b[d] + b[d + 1]; 
                }
            }
        }
        System.out.println(f);
    }
}