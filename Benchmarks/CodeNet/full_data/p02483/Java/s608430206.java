import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int[] array = new int[line.length];
        for(int i = 0; i < line.length; i++) {
            array[i] = Integer.parseInt(line[i]);
        }
        for(int i = 0; i < line.length - 1; i++) {
            for(int j = 1; j < line.length; j++) {
                if(array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i != array.length - 1) {
                System.out.print(" ");
            }
        }
    }
}