import java.util.*;
import java.lang.*;
public class Main{
    public static int calc(int arr[][],int i,int j,int n){
        // System.out.println(i+" "+j);
        //Base Case
        if(i==n-1)return arr[i][j];

        //Recursive Approach
        int max=0;
        for(int k=0;k<3;k++){
           
            if(k!=j){
                int op=calc(arr,i+1,k,n)+arr[i][j];
                max=Math.max(max,op);
            }


        }
        return max;



    }

    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[][]=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int res=Math.max(calc(arr,0,0,n),Math.max(calc(arr,0,1,n),calc(arr,0,2,n)));
        System.out.println(res);
    }
    
}