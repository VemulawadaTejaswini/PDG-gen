import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(a);

        int[] c = new int[n];

        if(n % 2 == 0){
            int[] b1 = new int[n/2];
            int[] b2 = new int[n/2];
            for(int i=0; i<n/2; i++){
                b1[i] = a[n/2 - i - 1];
                b2[i] = a[n/2 + i];
            }
            for(int i=0; i<n/2; i++){
                c[i*2] = b1[i];
                c[i*2+1] = b2[n/2-i-1];
            }
        }else{
            int[] b1 = new int[n/2];
            int[] b2 = new int[n/2];
            for(int i=0; i<n/2; i++){
                b1[i] = a[n/2 - i - 1];
                b2[i] = a[n/2 + i + 1];
            }
            if(Math.abs(a[n/2] - a[n/2-1]) < Math.abs(a[n/2] - a[n/2+1])){
                for(int i=0; i<n/2; i++){
                    c[i*2] = b1[i];
                    c[i*2+1] = b2[n/2-i-1];
                }
                c[n-1] = a[n/2];
            }else{
                for(int i=0; i<n/2; i++){
                    c[i*2+1] = b1[n/2-i-1];
                    c[i*2] = b2[i];
                }
                c[n-1] = a[n/2];
            }
            
        }

        long ans = 0;
        for(int i=0; i<n-1; i++){
            ans += Math.abs(c[i+1] - c[i]);
        }

        System.out.println(ans);
    }
}