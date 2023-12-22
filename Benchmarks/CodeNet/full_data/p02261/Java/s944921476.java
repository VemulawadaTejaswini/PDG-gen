import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] A = br.readLine().split(" " , n);
        String[] B = A.clone();

        //BubbleSort 
        for(int i=0; i<A.length; i++){
            for(int j=A.length-1; j>i; j--){
                if(A[j].charAt(1)<A[j-1].charAt(1)){
                    swap(A, j, j-1);
                }
            } 
        }
        printArray(A);
        System.out.println("Stable");

        //SelectionSort
        for(int i=0; i<B.length; i++){
            int min_i = i;
            for(int j=i+1; j<B.length; j++){
                if(B[j].charAt(1)<B[min_i].charAt(1)){
                    min_i = j;
                }
            }
            if(min_i!=i) swap(B, i, min_i);
        }
        String judge = Arrays.equals(A,B)?"Stable":"Not stable";
        printArray(B);
        System.out.println(judge);
    }

    static void printArray(String[] A){
    	StringBuilder sb = new StringBuilder();
        for(String k : A){
            sb.append(k + " ");
        }
        System.out.println(sb.toString().substring(0 , sb.length() - 1));
    }

    static void swap(String[] A, int i, int j){
    	String k = A[i];
        A[i] = A[j];
        A[j] = k;
    }
}

