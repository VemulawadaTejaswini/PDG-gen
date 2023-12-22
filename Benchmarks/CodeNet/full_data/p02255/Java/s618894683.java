import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i]=scanner.nextInt();
        }
        printList(A,N);
        insertionSort(A,N);
    }
     
    static void insertionSort(int[] A,int N){
        for(int i=1;i<N;i++){
            int v = A[i];
            int j=i-1;
            while(j>=0 && (v < A[j])){
                A[j+1]=A[j];
                j--;
            }
            A[j+1]= v;
            printList(A,N);
        }
    }
    static void printList(int[] A,int N){
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<N;i++){
            if(i>0){
                builder.append(" ");
            }
            builder.append(A[i]);
        }
        System.out.println(builder);
    }
}