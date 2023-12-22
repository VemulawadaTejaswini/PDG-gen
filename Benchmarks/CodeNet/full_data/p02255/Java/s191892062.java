import java.util.Scanner;

class InsertionSort{

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


        String ans = "" +numbers[0];

        for (int i = 1; i < numbers.length; i++)
            ans = ans + " " + numbers[i];

        System.out.println(ans);
    }


    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] numbers = new int[length];

        for(int i = 0; i< length; i++)
            numbers[i] = sc.nextInt();

        InsertionSort is = new InsertionSort();

        is.insertionSort(length,numbers);

        // Test
        //is.insertionSort(6,new int[]{5,2,4,6,1,3});
        //is.insertionSort(3,new int[]{1,2,3});

    }
}
