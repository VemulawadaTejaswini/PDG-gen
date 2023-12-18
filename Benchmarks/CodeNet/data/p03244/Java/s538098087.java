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
            HashMap<Integer, Integer> oddMap = getMap(oddArray);
            HashMap<Integer, Integer> evenMap = getMap(evenArray);

            int oddNum = maxCountNum(oddMap);
            int evenNum = maxCountNum(evenMap);

            int finalOdd = oddArray.length-oddMap.get(oddNum);
            int finalEven = evenArray.length-evenMap.get(evenNum);

            if(oddNum == evenNum){
                int nextOddNum = nextMaxCountNum(oddMap, oddNum);
                int nextEvenNum = nextMaxCountNum(evenMap, evenNum);

                int nextFinalOdd = oddArray.length-nextOddNum;
                int nextFinalEven = oddArray.length-nextEvenNum;

                System.out.println(Math.min(finalOdd+nextFinalEven, nextFinalOdd+finalEven));
            } else {
                System.out.println(finalOdd + finalEven);
            }
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

    HashMap<Integer, Integer> getMap(int[] array){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<array.length; i++){
            if(map.containsKey(array[i])) map.put(array[i], map.get(array[i])+1);
            else map.put(array[i], 1);
        }
        return map;
    }

    int maxCountNum(HashMap<Integer, Integer> map){
        int maxValue = -1;
        int maxKey = -111;
        for(Integer key: map.keySet()){
            int value = map.get(key);
            if(value > maxValue){
                maxValue = value;
                maxKey = key;
            }
        }
        return maxKey;
    }

    int nextMaxCountNum(HashMap<Integer, Integer> map, int maxKey){
        int nextMaxKey = -1;
        for(Integer key: map.keySet()){
            if(key == maxKey) continue;
            int value = map.get(key);
            if(value > nextMaxKey){
                nextMaxKey = value;
            }
        }
        return nextMaxKey;
    }
}
