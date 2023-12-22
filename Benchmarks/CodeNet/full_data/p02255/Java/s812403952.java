import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        String[] strArray = br.readLine().split(" ");
        
        for(int i=0; i<n; i++){
            array[i] = Integer.parseInt(strArray[i]);
        }
        insertionSort(array, n);
    }
    
    public static void insertionSort(int[] A, int N){
        for(int i = 0; i < N; i++){
            int key = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > key){
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
            toArray(A);
        }
    }
    
    public static void toArray(int[] out) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < out.length; i++){
            sb.append(out[i]);
            if(i < out.length - 1)
                sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}