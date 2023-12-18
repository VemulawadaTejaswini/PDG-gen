import java.util.*;
public class Main {
   
   static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  a
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        bubbleSort(arr);
        if (arr[0]==5&&arr[1]==5&&arr[2]==7) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }
    }
}	