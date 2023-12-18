import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.BiConsumer;

public class Main {

    //グローバル変数を定義

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] oddArray = new int[n/2];
        int[] evenArray = new int[n/2];

        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for(int i=0; i<n; i++){
            if((i+1) % 2 == 0){
                evenArray[evenCount] = array[i];
                evenCount++;
            } else {
                oddArray[oddCount] = array[i];
                oddCount++;
            }
        }

        int first = array[0];
        if(isAllSame(array, first)) {
            System.out.println(array.length/2);
        } else {
            int oddNum = maxCountNum(oddArray);
            int evenNum = maxCountNum(evenArray);

            System.out.println(oddArray.length-oddNum + evenArray.length-evenNum);
        }
    }

    boolean isAllSame(int[] array, int first) {
        int count = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] == first) count++;
        }
        if(count == array.length){
            return true;
        }
        return false;
    }

    int maxCountNum(int[] array){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<array.length; i++){
            if(map.containsKey(array[i])) map.put(array[i], map.get(array[i])+1);
            else map.put(array[i], 1);
        }
        int maxKey = -1;
        for(Integer key: map.keySet()){
            int value = map.get(key);
            if(value > maxKey){
                maxKey = value;
            }
        }
        return maxKey;
    }
}
