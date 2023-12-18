import java.util.*;
import java.math.*;
import java.util.Arrays;

class Main{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int n = Integer.parseInt(sc.next());
   int x = Integer.parseInt(sc.next());
   int y = Integer.parseInt(sc.next());
   int array[] = new int[n];
   Arrays.fill(array, 0);
   for (int i=0;i<n-1;i++){
     for (int j=i+1;j<n;j++){
      int l = Math.min(j-i,Math.abs(x-i)+Math.abs(y-j)+1);
      array[l-1] += 1;
     }
   }
   for (int i=0;i<n-1;i++){
     System.out.println(array[i]);
   }
   
}
}