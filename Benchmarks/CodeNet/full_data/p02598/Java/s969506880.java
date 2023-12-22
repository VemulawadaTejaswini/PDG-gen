import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] arr=new int[n];
        
        int i=0;
        int j=0;

        for(int l=0;l<n;l++){
            arr[l]=s.nextInt();
            j=Math.max(j,arr[l]);
        }

        if(k==0){
            System.out.println(j);
            return;
        }
        int ans=j;
        while(i<=j){
            int mid=(i+j)/2;
            if(isPossible(arr,mid,k)){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }

        System.out.println(ans);



    }

    public static boolean isPossible(int[] arr,int res,int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=res){

            }else{
                int nc=arr[i]/res;
                if(arr[i]%k==0){
                    nc--;
                }
                count=count+nc;
            }
        }
        return count<=k;
    }
}