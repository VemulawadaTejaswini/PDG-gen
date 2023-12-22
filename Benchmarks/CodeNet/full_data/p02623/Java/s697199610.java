import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        long[] b = new long[m];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextLong();
        }

        System.out.println(calc(a, b, k));
    }

    public static int calc(long[] a, long[] b, long k){
        int sum = 0;
        int i=0, j=0;
        while(sum < k){
            if(i>a.length-1 ){
                sum += b[j];
                if(sum<=k)
                j++;
            }else if(j > b.length-1){
                sum += a[i];
                if(sum<=k)
                i++;
            }else{
                if(a[i] < b[j]){
                    sum += a[i];
                    if(sum<k)
                    i++;
                }else{
                    sum += b[j];
                    if(sum<k)
                    j++;
                }
            }
        }
        return i + j;
    }
}
