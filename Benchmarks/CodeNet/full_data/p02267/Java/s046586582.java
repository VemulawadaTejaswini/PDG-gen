import java.io.*;
import java.util.*;

public class Main {

    static int containsInts(int[] arr, int[] queries) {
    	
        int i, j;
        int counter = 0;
        int total = 0;
        
        for(i = 0; i < queries.length; i++){
            for(j = 0; j < arr.length; j++){
                if (queries[i] == arr[j]){
                    counter = 1;
                }
            }
            total += counter;
            counter = 0;
        }
        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int arrSize = scanner.nextInt();

        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            int x = scanner.nextInt();
            arr[i] = x;
        }

        int queriesSize = scanner.nextInt();

        int[] queries = new int[queriesSize];

        for (int i = 0; i < queriesSize; i++) {
            int query = scanner.nextInt();
            queries[i] = query;
        }

        scanner.close();

        int res = containsInts(arr, queries);

        System.out.println(res);
    }
}

