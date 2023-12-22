import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));

        int len = Integer.parseInt(reader.readLine());
        int[] arr = new int[len];

        String arrStr = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(arrStr, " ");

        int i = 0;
        while (tokenizer.hasMoreElements()) {
            arr[i++] = Integer.parseInt((String) tokenizer.nextElement());
        }

//         int[] arr = {1,2,3,4,5};
//         int len = arr.length;

        bubblesort(arr, len);
    }
    

    private static void bubblesort(int[] arr, int len) {
      
        int swapCnt = 0;
        
        for (int i = 0; i < len - 1; i++) {
            
//            System.out.println("===========================");
            for (int j = (len - 1); j > i ; j--) {

//                System.out.println("i:" + i + " j:" + j);
                
                int current = arr[j];
                int target = arr[j - 1];

                if (target > current) {

                    swapCnt++;

                    int swap = arr[j -1];
                    arr[j - 1] = arr[j];
                    arr[j] = swap;
                }
                
                
            }
            
            
        }
        printArr(arr);
        System.out.println(swapCnt);
    }

    static void printArr(int[] arr) {
        String msg = "";
        for (int i = 0; i < arr.length; i++) {
            msg += arr[i];
            if (i == arr.length - 1) {
                break;
            }
            msg += " ";
        }

        System.out.println(msg);
    }

}