import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException{
        //input                                                                   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] temp_A = br.readLine().split(" ");
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = Integer.parseInt(temp_A[i]);
        }
        //solve                                                                   
        int pivot = partition(A, 0, n-1);
        //output                                                                  
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(i != 0){
                sb.append(" ");
            }
            if(i == pivot){
                sb.append('[');
                sb.append(A[pivot]);
                sb.append(']');
            }else{
                sb.append(A[i]);
            }
        }
        System.out.println(sb);

    }
    public static int partition(int[] A, int p, int r){
        int x = A[r];
        int i = p-1;
        int temp = 0;
        for(int j = p; j < r; j++){
            if(A[j] <= x){
                i++;
                //A[j]??¨A[i]?????????                                                
                temp = A[j];
                A[j] = A[i];
                A[i] = temp;
            }
        }
        temp = A[i+1];
        A[i+1] = A[r];
        A[r] = temp;

        return i+1;
    }

}