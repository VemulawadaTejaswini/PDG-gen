import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int n,m,con,sum,tmp;
        sum=0;
        con=0;
        n=scan.nextInt();
        m=scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        tmp=sum/(4*m);
        if(tmp==0)tmp=1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>=tmp) con +=1;
            else break;
        }
        if(con>=m) System.out.println("Yes");
        else System.out.println("No");
    }
}