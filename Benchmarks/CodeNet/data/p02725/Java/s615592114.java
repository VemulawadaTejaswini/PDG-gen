import java.util.Scanner;
import java.util.Arrays;

class Main {
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   int k = scanner.nextInt();
   int n = scanner.nextInt();
   int[] a = new int[n]; //Input
   int[] array = new int[n]; //Distance from 0
   
   for(int i = 0; i < n; i++) {
     a[i] = scanner.nextInt(); 
     if(a[i] > k/2) {
       array[i] = -(k - a[i]);
     } else {
       array[i] = a[i];
     }
   }
   Arrays.sort(array);
   int r = array[n-1] - array[0];
   System.out.println(r);
 }
}
