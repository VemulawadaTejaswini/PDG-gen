import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        boolean flag=true;
        int counter=0;
        while(flag){
            flag=false;
            for(int j=n-1;j>=1;j--){
                if(a[j]<a[j-1]){
                    int t=a[j];
                    a[j]=a[j-1];
                    a[j-1]=t;
                    counter++;
                    flag=true;
                }
            }        
        }
        for(int i=0;i<=n-2;i++) System.out.printf("%d ",a[i]);
        System.out.println(a[n-1]);
        System.out.println(counter);
    }
}