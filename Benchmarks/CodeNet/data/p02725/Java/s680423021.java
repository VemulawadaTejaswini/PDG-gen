import java.util.Scanner;

class Main {
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   int k = scanner.nextInt();
   int n = scanner.nextInt();
   int[] a = new int[n];
   a[0] = scanner.nextInt();
   int max = 0;
   for(int i = 1; i < n; i++) {
     if(a[i]-a[i-1] > max) {
       max = a[i]-a[i-1]; 
     }
   }
   if(max <= k/2) {
     max = k - max;
   }
   System.out.println(max);
 }
}