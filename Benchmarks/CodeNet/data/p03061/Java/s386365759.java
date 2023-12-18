import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        int gcd = 1;
        for (int i = 0; i < N; i++) {
            int newGcd = gcd(removeElement(A, i));
            if (newGcd > gcd) {
                gcd = newGcd;
            }
        }
        System.out.print(gcd);
    }
    
    public static int[] removeElement(int[] arr, int index) {
        // If the array is empty 
        // or the index is not in array range 
        // return the original array 
        if (arr == null
            || index < 0
            || index >= arr.length) { 
  
            return arr; 
        } 
  
        // Create ArrayList from the array 
        List<Integer> arrayList = IntStream.of(arr) 
                                      .boxed() 
                                      .collect(Collectors.toList()); 
  
        // Remove the specified element 
        arrayList.remove(index); 
  
        // return the resultant array 
        return arrayList.stream() 
            .mapToInt(Integer::intValue) 
            .toArray(); 
    }
    
    public static int gcd(int arr[]) {
        int l = arr.length;
        int result = arr[0]; 
        for (int i = 1; i < l; i++) 
            result = getGCD(arr[i], result); 
  
        return result; 
    }
    
    public static int getGCD(int a, int b) {
     // Everything divides 0  
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 
       
        // base case 
        if (a == b) 
            return a; 
       
        // a is greater 
        if (a > b) 
            return getGCD(a-b, b); 
        return getGCD(a, b-a); 
    }
}
