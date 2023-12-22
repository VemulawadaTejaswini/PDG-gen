import java.util.Scanner;

import java.lang.StringBuilder;

class Main{

    public void insertionSort(int n,int[] numbers){

        toString(numbers);

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

        /**
        StringBuilder ans = new StringBuilder().append(numbers[0]);
        for (int x = 1; x < numbers.length; x++)
            ans.append(" ").append(numbers[x]);
        System.out.println(ans.toString());
         */

        String ans = "" +numbers[0];

        for (int i = 1; i < numbers.length; i++)
            ans = ans + " " + numbers[i];

        System.out.println(ans);
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] numbers = new int[length];

        int i = 0;
        while(sc.hasNextInt() && i < length) {
            numbers[i] = sc.nextInt();
            i++;
        }

        Main is = new Main();

        is.insertionSort(length,numbers);

 
    }
}
