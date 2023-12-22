import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // int num = 5;
            // int[] arr = {5, 3, 2, 4, 1};
            
            int num = Integer.parseInt(br.readLine());
            String[] temp = br.readLine().split("\\s");
            int[] arr = new int[num];
            
            for(int i=0; i<num; i++) {
                arr[i] = Integer.parseInt(temp[i]);
            }
            
            Sort sort = bubbleSort(num, arr);
            
            String[] output = new String[num];
            
            for(int i=0; i<num; i++){
                output[i] = String.valueOf(sort.array[i]);
            }
            System.out.println(String.valueOf(String.join(" ", output)));
            System.out.println(String.valueOf(sort.count));
            
            
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    static Sort bubbleSort(int num, int[] arr) {
        int count = 0;
        for(int i=0; i<num; i++) {
            for(int j=num-1; i<j; j--){
                if(arr[j] < arr[j-1]) {
                    int tmp = arr[j];
                    arr[j]  = arr[j-1];
                    arr[j-1] =  tmp;
                    count += 1;
                }
            }
        }
        return new Sort(count, arr);
    }
}

class Sort{
    public int count;
    public int[] array;
    
    public Sort(int count, int[] array){
        this.count = count;
        this.array = array;
    }
}
