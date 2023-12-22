import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int n,count;
    public static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        sumDigits();
        for(int i=0;i<n;i++){
            if(i==n-1)System.out.printf("%d",a[i]);
            else System.out.printf("%d ",a[i]);
        }
        System.out.printf("\n%d\n",count);
        sc.close();
    }
    public static void sumDigits() {
            for(int i=0;i<n;i++){
                int minj=i;
                for(int j=i;j<n;j++){
                    if(a[j]<a[minj]){
                        minj=j;
                    }
                }
                if(i!=minj){
                    int b;
                    b=a[i];
                    a[i]=a[minj];
                    a[minj]=b;
                    count++;
                }
            }
    }
}
