import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n,m,s,c;
        n=scan.nextInt();
        m=scan.nextInt();
        if(n<m){
            System.out.println("-1");
            System.exit(0);
        }
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=0;
        }
        for(int i=0;i<m;i++){
            s=scan.nextInt();
            c=scan.nextInt();
            if(s==1&&c==0){
                System.out.println("-1");
                System.exit(0);
            }
            else{
                arr[s-1]=c;
            }
        }
        for(int a:arr){
            System.out.printf("%d",a);
        }


    }
}