import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=0;i<n-1;i++){
            if(a[i]<a[i+1]){
               sum+=a[i+1]-a[i];
            }
        }
        if(a[n-1]>a[n-2]){
            sum=sum+1;
        }
        System.out.println(sum);
    }
}
