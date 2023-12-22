import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            a[i] = sc.nextInt();
        }
        sc.close();
        int s = 1000;
        int kab = 0;
        for(int i = 0 ; i < n - 1 ; i++){
            if(a[i] <= a[i + 1]){
                kab = s / a[i];
                s -= kab * a[i];
                s += a[i + 1] * kab;
                kab = 0;
            }
        }
        System.out.println(s);
    }
}