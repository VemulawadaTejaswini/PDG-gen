import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int k = scan.nextInt();
        
        int[] qarr = new int[n];
        int[] varr = new int[n];
        
        for(int i = 0; i < n; i++){
            varr[i] = scan.nextInt();
            qarr[i] = scan.nextInt();
        }
        
        sort(varr,0,n-1,qarr);

        int sum = 0;
        
        for(int i = 0; i < n; i++){
            sum += qarr[i];
            if(sum >= k){
                System.out.println(varr[i]);
                break;
            }
        }
        
    }
    
    static int partition(int arr[], int low, int high,int[] arr2) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
                if(arr2[i] != arr2[j])
                {arr2[i] ^= arr2[j];
                arr2[j] ^= arr2[i];
                arr2[i] ^= arr2[j];}
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    static void sort(int arr[], int low, int high,int[] arr2) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high, arr2); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1, arr2); 
            sort(arr, pi+1, high, arr2); 
        } 
    } 
    
}
