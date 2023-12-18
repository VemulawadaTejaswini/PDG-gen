import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] ar=new int[n];
        int min=0;
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
            //min=Math.min(Math.abs(ar[i]-0),min);
        }
        int[] sum=new int[n];
        sum[0]=0;
        //System.out.println();
        for(int i=1;i<n;i++){
            sum[i]=ar[i]-ar[i-1]+sum[i-1];
            //System.out.print(sum[i]+" ");
        }
        int total=Integer.MAX_VALUE,x=-1;
        for(int i=0;i<=n-k;i++){
            int count=sum[i+k-1]-sum[i];
            //System.out.println("count="+count);
            if(total>count){
                total=count;
                x=i;
            }
        }
        /*if(ar[x]>=0 && ar[x+k-1]>=0){
            
        }
        else if(ar[x]<=0 && ar[x+k-1]<=0){
            
        }
        else{*/
            if(Math.abs(ar[x+k-1]-0)<Math.abs(ar[x]-0)){
                min=Math.abs(ar[x+k-1]-0);
            }
            else{
                min=Math.abs(ar[x]-0);
            }
        //}    
        total+=min;
        System.out.println(total);
    }  
}