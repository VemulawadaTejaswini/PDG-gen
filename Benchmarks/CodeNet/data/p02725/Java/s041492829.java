import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int k,n;
        k=scan.nextInt();
        n=scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        int[] max={0,Math.abs(arr[0]-arr[1])};
        for(int i=1;i<n-1;i++){
            if(Math.abs(arr[i]-arr[i+1])>=max[1]){
                max[0]=i;
                max[1]=Math.abs(arr[i]-arr[i+1]);
            }
        }
        if(arr[0]==0){
            if(Math.abs(k-arr[n-1])>max[1]){
                max[1]=Math.abs(k-arr[n-1]);
            }
        }
        else if(Math.abs(arr[0]-arr[n-1])>max[1]){
            max[0]=n-1;
            max[1]=Math.abs((arr[0]-arr[n-1]));
        }

        System.out.println(k-max[1]);
    }
}