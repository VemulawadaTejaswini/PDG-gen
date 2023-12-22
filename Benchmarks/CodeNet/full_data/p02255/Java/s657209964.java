

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
    }
    public static void insertionSort(int[] arr) {
        out_put(arr);
        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            out_put(arr);
        }
    }
    
    private static void out_put(int array[]){

        System.out.printf("%d", array[0]);

        for(int i = 1; i < array.length; i++){
            System.out.printf(" %d", array[i]);
        }
        System.out.printf("\n");
    }
}

