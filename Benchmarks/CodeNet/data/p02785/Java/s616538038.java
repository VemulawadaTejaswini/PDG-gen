import java.util.*;


public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int []A=new int[N];
        for(int i=0;i<N;A[i++]=sc.nextInt()){}
        
        Main m=new Main();
        m.mergeSort(A, 0, N-1);
        long sum=0;
        for(int i=0;i<N-K;i++)sum=sum+A[i];
        System.out.println(sum);
    }
     public void mergeSort(int []a,int left,int right){
        if(left<right){
            int m=(left+right)/2;
            mergeSort(a, left, m);
            mergeSort(a, m+1, right);
            merging(a,left,m,right);
            
        }
        
        
    }
    private void merging(int[]a,int left,int m,int right){
        int n1=m-left+1;
        int n2=right-(m+1)+1;
        int []L=new int[n1];
        int []R=new int[n2];
        
        for(int i=0;i<n1;i++){L[i]=a[left+i];}
        for(int i=0;i<n2;i++){R[i]=a[m+1+i];}
        
        int i=0;int j=0;
        int k=left;
        while(i<n1&&j<n2){
            if(L[i]<=R[j]){
                a[k]=L[i];
                i++;
            }
            else {
                a[k]=R[j];
                j++;
            }
            k++;
        }
        
        while(i<n1){
            a[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=R[j];
            j++;
            k++;
        }
    }
    
}

