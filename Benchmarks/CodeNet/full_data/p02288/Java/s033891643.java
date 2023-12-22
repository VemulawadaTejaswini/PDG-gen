import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int [] A = new int [n+1];
        for(int i=1;i<=n;i++) A[i] = sc.nextInt();
        for(int i=n/2;i>=1;i--)maxheap_build(A,i);
        for(int i=1;i<=n;i++) System.out.print(" "+A[i]);
        System.out.println();
    }
    public static void maxheap_build(int [] A,int i){
        int largest = 0;
        if (i * 2 < A.length&& A[i*2] > A[i]) largest = i*2;
        else largest = i;
        if(i*2+1<A.length&&A[i*2+1]>A[largest]) largest = i*2+1;
        if(largest!=i){
            int k = A[largest];
            A[largest] = A[i];
            A[i] = k;
            maxheap_build(A,largest);
        }
    }
}
