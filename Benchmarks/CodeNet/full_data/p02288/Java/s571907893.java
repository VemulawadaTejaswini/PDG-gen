import java.util.*;
public class Main{
    public static void maxHeapify(long A[], int idx){
        int l = 2*idx;
        int r = 2*idx + 1;
        int largest = 0;
        if(l <= A.length-1 && A[l] > A[idx])
            largest = l;
        else
            largest = idx;
        if(r <= A.length-1 && A[r] > A[largest])
            largest = r;
        if(largest != idx){
            long tmp = A[idx];
            A[idx] = A[largest];
            A[largest] = tmp;
            maxHeapify(A,largest);
        }
            
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        long A[] = new long[H+1];
        for(int i = 1 ; i <= H ; i++)
            A[i] = sc.nextLong();
        for(int i = H/2 ; i > 0 ; i--)
            maxHeapify(A,i);
        for(int i = 1 ; i <= H ; i++)
            System.out.print(" " + A[i]);
        System.out.println();
    }
}
