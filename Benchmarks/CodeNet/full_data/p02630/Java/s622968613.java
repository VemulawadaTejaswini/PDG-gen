import java.util.*;
public class Main
{
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int b[]=new int[k];
        int c[]=new int[k];

        for(int i=0;i<k;i++) {
            b[i] =sc.nextInt();
            c[i] =sc.nextInt();
        }
        for(int i=0;i<k;i++) {
            int sum=0;
            for(int j=0;j<n;j++){
                if(a[j]==b[i]){
                    a[j]=c[i];
                }
                sum=sum+a[j];
            }
            System.out.println(sum);
        }
    }
}

