import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n,flag;
        flag=0;
        n= scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
                if(arr[i]==arr[j]){
                    flag=1;
                    System.out.printf("no");
                    break;
                }
            }
            if(flag==1) break;
        }
        if(flag==0) System.out.printf("yes");
    }
}