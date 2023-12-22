import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.lang.StringBuilder;

class InsertionSort{

    public void insertionSort(int n,int[] numbers){
        for (int i = 1; i < n; i++) {
            int key = numbers[i];
            /* insert A[i] into the sorted sequence A[0,...,j-1] */
            int j = i - 1;

            while (j >= 0 && numbers[j] > key){
                numbers[j+1] = numbers[j];
                j--;
            }

            numbers[j+1] = key;
            // print the current list
            toString(numbers);

        }
    }
    public void toString(int[] numbers){
        StringBuilder ans = new StringBuilder().append(numbers[0]);
        for (int x = 1; x < numbers.length; x++)
            ans.append(" ").append(numbers[x]);
        System.out.println(ans.toString());

    }


    public static void main(String[] args) throws IOException {

        // read the input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        int[] numbers = new int[length];

        String[] line = br.readLine().split(" ");

        // copy numbers into our list
        for(int i = 0; i< length; i++){
            numbers[i] = Integer.parseInt(line[i]);
        }

        /**
        int length = 6;
        int[] numbers = new int[]{5,2,4,6,1,3};
         */


        InsertionSort is = new InsertionSort();
        is.toString(numbers);
        is.insertionSort(length,numbers);

    }
}
