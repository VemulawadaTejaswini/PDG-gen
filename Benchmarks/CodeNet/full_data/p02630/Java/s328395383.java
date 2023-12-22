import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        while (k-->=1){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=0;
        int e=n-1;
        int mid;
        while (s<=e){
            mid=(s+e)/2;
            if (ar[mid]==a){
                ar[mid]=b;
            }
            if (ar[mid] > a) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        long sum=0;
        for (int i=0;i<n;i++){
            sum+=ar[i];
        }
            System.out.println(sum);
        }
    }

}
