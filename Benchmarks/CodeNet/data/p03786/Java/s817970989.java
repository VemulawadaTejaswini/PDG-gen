import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        long[] sum=new long[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(i==0)sum[i]=a[i];
            else if(i>0)sum[i]=sum[i-1]+a[i];
        }
        int count=0;
        for(int i=0;i<n;i++){
            long boss=a[i];
            if(boss*2>=a[n-1]){
                count++;
                continue;
            }
            int j=i;
            while(j<n-1){
                if(boss*2>=a[j]){
                    boss=sum[j];
                }
                j++;
                if(boss*2>=a[n-1]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}