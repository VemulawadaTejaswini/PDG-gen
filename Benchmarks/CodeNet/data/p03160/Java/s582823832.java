import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int[] arr = new int[num];
        for(int i = 0; i < num;i++) arr[i] =scn.nextInt();

        System.out.println(frogJmp(arr,0,0));
    }

    public static int frogJmp(int[] arr,int idx,int sum) {

        if(idx>=arr.length-1){
            //System.out.println(sum);
            return sum;
        }
        int cSum1 = 0;
        int cSum2 = 0;
       if(idx==0){
         cSum1 =  frogJmp(arr,idx+1,sum+arr[idx]);
       }else{
         cSum1 =  frogJmp(arr,idx+1,sum+(int)Math.abs(arr[idx]-arr[idx-1]));
       }
       //int cSum1 =  frogJmp(arr,idx+1,sum+arr[idx]-arr[idx-1]);

       if(idx<=1){
         cSum2 =  frogJmp(arr,idx+2,sum+arr[idx]);
       }else{
         cSum2 =  frogJmp(arr,idx+2,sum+(int)Math.abs(arr[idx]-arr[idx-2]));
       }

    //    int cSum2 =  frogJmp(arr,idx+2,sum+arr[idx]-arr[idx-2]);

        return Math.min(cSum1,cSum2);
    }
}