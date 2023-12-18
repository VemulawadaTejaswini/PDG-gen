import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[1000000001];
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            arr[k]=sc.nextInt();
        }
        long total=0;
        for(int i=1;i<=1000000000;i++){
            if(arr[i]!=0){
                if(m>arr[i]){
                    m-=arr[i];
                    total+=arr[i]*i;
                }else{
                    total+=m*i;
                    break;
                }
            }
        }
        System.out.println(total);

    }
}
