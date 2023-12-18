import java.util.Arrays;
import java.util.Scanner;

public final class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int m = stdIn.nextInt();

        long[] a = new long[n];
        int[] b = new int[m];
        long[] c = new long[m];

        for(int i=0; i<n; i++){
            a[i] = stdIn.nextInt();
        }

        for(int i=0; i<m; i++){
            b[i] = stdIn.nextInt();
            c[i] = stdIn.nextInt();
        }
        
        Arrays.sort(a);

        for(int i=0; i<m; i++){
            int times = b[i];
            while(times>0){
                if(c[i]>a[0]){
                    int idx = 0;
                    for(; idx<a.length; idx++){
                        if(a[idx]>c[i]){
                            idx--;
                            break;
                        }
                    }
                    if(idx == a.length){
                        idx--;
                    }
                    for(int j=0; j<=idx; j++){
                        if(j == a.length-1){
                            a[j] = 0;
                        }else{
                            a[j] = a[j+1];
                        }
                    }
                    a[idx] = c[i];
                    times--;
                }else{
                    break;
                }
            }
        }

        long sum = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }

        System.out.println(sum);
    }
}