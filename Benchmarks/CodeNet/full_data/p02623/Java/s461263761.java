import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }

        System.out.println(calc(a, b, k));
    }

    public static int calc(int[] a, int[] b, long k){
        int sum = 0;
        int i=0, j=0;
        while(sum < k){
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
        return i + j;
    }
}
