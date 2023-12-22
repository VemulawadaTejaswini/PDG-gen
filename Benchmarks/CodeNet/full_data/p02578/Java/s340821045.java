import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int mx[] = new int[n];
        mx[0]=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>mx[i-1]){
                mx[i]=a[i];
            }
            else{
                mx[i]=mx[i-1];
            }
        }
        long sum=0;
        for(int i=0;i<n;i++){
            if(a[i]<mx[i])
                sum+=(long)(mx[i]-a[i]);
        }
        System.out.println(sum);
    }
}