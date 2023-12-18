import java.util.Scanner;
public class mergeSort {

    public static void sort(int[] array, int low, int high){
        if(low < high){
            int middle = (low + high) >>> 1;
            mergeSort.sort(array, low , middle);
            mergeSort.sort(array, middle+1, high);
            mergeSort.merge(array, low, middle, high);
        }

    }
    public static void merge(int[] array, int low, int middle, int high){
        int[] helper = new int[array.length];

        for (int i = low; i <= high; i++){
            helper[i] = array[i];
        }
        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while (helperLeft <= middle && helperRight <= high){
            if (helper[helperLeft] <= helper[helperRight]){
                array[current] = helper[helperLeft];
                helperLeft ++;
            }
            else {
                array[current] = helper[helperRight];
                helperRight ++;

            }
            current ++;
        }
        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++){
            array[current + i] = helper[helperLeft + i];
        }



    }

 
}

public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] p = new int[n];
   for(int i = 0; i<n ; i++){
   p[i] = sc.nextInt();
   }
   int K = 0;
   mergeSort.sort( p,0, p.length-1);
   K = p[(N/2)] - p[(N/2)-1];
  System.out.println(K);   
 }
}