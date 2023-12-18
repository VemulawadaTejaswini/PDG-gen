import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        int[] l = new int[n];
        l[0] = a[0];
        for(int i = 1; i < n-1; i++){
            l[i] = gcd(l[i-1], a[i]);
        }
        int[] r = new int[n];
        r[n-1] = a[n-1];
        for(int i = n-2; i > 0; i--){
            r[i] = gcd(r[i+1], a[i]);
        }
        
        int max = 0;
        int gcd;
        if(r[1] > max){
            max = r[1];
        }
        for(int i = 0; i < n-2; i++){
            gcd = gcd(l[i], r[i+2]);
            if(gcd > max){
                max = gcd;
            }
        }
        if(l[n-2] > max){
            max = l[n-2];
        }
        
        System.out.println(max);
    }
    
    private static int gcd(int a, int b){
        
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
}