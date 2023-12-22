import java.util.*;
public class Main{
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        mergeSort(num,0,n);
        System.out.println(count);
    }
    public static void mergeSort(int[] num,int left,int right){
        if(left+1<right){
            int mid=(left+right)/2;
            mergeSort(num,left,mid);
            mergeSort(num,mid,right);
            merge(num,left,mid,right);
        }
    }
    public static void merge(int[] num,int left,int mid,int right){
        int n1=mid-left;
        int n2=right-mid;
        int[] L=new int[n1+1];
        int[] R=new int[n2+1];
        for(int i=0;i<n1;i++){
            L[i]=num[left+i];
        }
        for(int i=0;i<n2;i++){
            R[i]=num[mid+i];
        }
        L[n1]=Integer.MAX_VALUE;
        R[n2]=Integer.MAX_VALUE;
        int l=0;
        int r=0;
        for(int k=left;k<right;k++){
            if(L[l]<R[r]){
                num[k]=L[l++];
                count+=r;
            }else{
                num[k]=R[r++];
            }
        }
    }
}
