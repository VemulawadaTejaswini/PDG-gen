import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int k,n;
        long sum;
        n=scan.nextInt();
        k=scan.nextInt();
        sum=0;
        long[] arr = new long[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        n-=k;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}