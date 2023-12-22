import java.io.*;
import java.util.*;


//I have to use hashset
public class Main{
    static int count =0;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        
        str = br.readLine();
        int n = Integer.parseInt(str);

        str=br.readLine();
        String[] temp = str.split("\\s");
        
        int[] A = new int[temp.length];
        for(int i= 0;i<temp.length;i++){
            A[i] = Integer.parseInt(temp[i]);
        }
        
        mergeSort(A,0,n);
        
        for(int i=0;i<A.length;i++){
            if( i != A.length -1){
                System.out.print(A[i] + " ");
            }else{
                System.out.println(A[i]);
            }
        }
        System.out.println(count);
        
    }

    public static void mg(int[] A,int left,int mid,int right){
        int n1 = mid -left;
        int n2 = right -mid;

        int[] L = new int[n1+1];
        int[] R = new int[n2+1];

        for(int i=0;i<n1;i++){
            L[i] = A[left +i];
        }
        for(int i=0;i<n2;i++){
            R[i] = A[mid +i];
        }

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i=0;
        int j=0;

        for(int k= left;k<right;k++){
            count++;
            if(L[i] <= R[j]){
                A[k] = L[i];
                i++;
            }else{
                A[k] = R[j];
                j++;
            }
        }
    }
    
    public static void mergeSort(int[] A,int left,int right){
        if(left+1 < right){
            int mid = (left +right)/2;
            mergeSort(A,left,mid);//2この配列まで分ける
            mergeSort(A,mid,right);
            mg(A,left,mid,right);
        }
    }
     
}

