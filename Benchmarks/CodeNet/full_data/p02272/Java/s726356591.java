import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.lang.Integer ;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" " , n);
        int[] A = new int[n];
        
        for(int i = 0; i < n; i++){
            A[i] = Integer.parseInt(input[i]);
        }
        int count=mergeSort(A,0,n);
        printArray(A);
        System.out.println(count);
    }

    static void printArray(int[] A){
        StringBuilder sb = new StringBuilder();
        for(int k : A){
            sb.append(k + " ");
        }
        System.out.println(sb.toString().substring(0 , sb.length() - 1));
    }

    static int mergeSort(int[] A, int left, int right){
        int count=0;
        if(left+1<right){
            int mid = (left+right)/2;
            count+=mergeSort(A, left, mid);
            count+=mergeSort(A, mid, right);
            count+=merge(A, left, mid, right);
        }
        return count;
    }

    static int merge(int[] A, int left, int mid, int right){
        int count=0; //comparisons
        int n1=mid-left, n2=right-mid;
        int[] L=new int[n1+1], R=new int[n2+1];
        System.arraycopy(A, left, L, 0, n1);
        System.arraycopy(A, mid, R, 0, n2);
        L[n1]=Integer.MAX_VALUE;
        R[n2]=Integer.MAX_VALUE;
        int i=0, j=0;
        for(int k=left; k<right; k++){
            count++;
            if(L[i]<=R[j]){
                A[k]=L[i];
                i++;
            }else{
                A[k]=R[j];
                j++;
            }
        }
        return count;
    }
}

