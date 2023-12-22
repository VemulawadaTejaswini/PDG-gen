import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        
        int curr=arr[0];
        int ans=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                ans+=curr-arr[i];
            }
            else{
                curr=arr[i];
            }
        }

        System.out.print(ans);
    }
}