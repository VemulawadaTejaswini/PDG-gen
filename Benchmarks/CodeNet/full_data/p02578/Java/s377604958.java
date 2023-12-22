import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int[]a=new int[n];
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(a[i]<a[i+1]){
                ans+=a[i+1]-a[i];
            }
        }
        if(a[n-1]>a[n-2])
            System.out.println(ans+(a[n-1]-a[n-2]));
        else{
            System.out.println(ans);
        }
    }
}
