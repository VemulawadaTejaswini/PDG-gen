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
    public static void insertionSort(int[] num, int N){
        int temp;
        int j;
        for(int i=0; i<N; i++){
            temp = num[1];
            j = i - 1;
            while (j>=0&&temp<num[j]){
                num[j+1] = num[j];
            }
            num[j+1]=temp;
            toArray(num);
        }
    }
    
    public static void toArray(int[] out) {
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<out.length;i++){
            sb.append(out[i]);
            if(i<out.length-1) sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}