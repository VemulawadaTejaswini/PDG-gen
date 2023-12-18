import java.util.*;
import java.math.*;

class Main{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int x = sc.nextInt()-1;
   int y = sc.nextInt()-1;
   int array[] = new int[n];
   for (int i=0;i<n;i++){
     array[i] = 0;
   }
   for (int i=0;i<n-1;i++){
     for (int j=i+1;j<n;j++){
      int leng = Math.min(j-i,Math.abs(x-i)+Math.abs(y-j)+1);
      array[leng-1] += 1;
     }
   }
   for (int i=0;i<n-1;i++){
     System.out.println(array[i]);
   }
   
}
}
