import java.util.Scanner;
public class Main {
 
  public static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
            
            if (arr[j] <= pivot) 
            { 
                i++; 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
               int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
 public static void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
  
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int [] arr=new int[3];
    
      arr[0]=sc.nextInt();
      arr[1]=sc.nextInt();
      arr[2]=sc.nextInt();
      
      sort(arr,0,2);
       String s=String.valueOf(arr[2]);
       s=s+String.valueOf(arr[1]);
       int sum=Integer.valueOf(s)+arr[0];
       System.out.println(sum);
      
    
    
    }
    
}
