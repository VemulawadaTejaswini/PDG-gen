import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[n];
        int sum = 0;
        for(int i = 0; i < n + 1; i++){
            a[i] = scan.nextInt();
            sum += a[i];
        }
        for(int i = 0; i < n; i++) b[i] = scan.nextInt();
        for(int i = 0; i < n; i++){
            if(a[i] <= b[i]){
                b[i] -= a[i];
                a[i] = 0;
                a[i + 1] = Math.max(a[i + 1] - b[i], 0);
            }else{
                a[i] -= b[i];
                b[i] = 0;
            }
        }
        int suma = 0;
        for(int i = 0; i < n + 1; i++) suma += a[i];
        System.out.println(sum - suma);
        scan.close();
    }
}