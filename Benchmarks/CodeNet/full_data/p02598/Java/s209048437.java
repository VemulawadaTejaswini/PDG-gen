import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long k=s.nextInt();
        long[] arr=new long[n];
        
        long i=1;
        long j=0;

        for(int l=0;l<n;l++){
            arr[l]=s.nextInt();
            j=Math.max(j,arr[l]);
        }

        if(k==0){
            System.out.println(j);
            return;
        }

        long ans=j;
        while(i<=j){
            long mid=(i+j)/2;
            if(isPossible(arr,mid,k)){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }

        if(isPossible(arr,ans-1,k)){
            ans=ans-1;
            }
        System.out.println(ans);



    }

    public static boolean isPossible(long[] arr,long res,long k){
        
        long count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=res){

            }else{
                long nc=arr[i]/res;
                if(arr[i]%res==0){
                    nc--;
                }
                System.out.println(nc);
                count=count+nc;
                if(count>k){
                    return false;
                }
            }
        }
        return true;
    }
}