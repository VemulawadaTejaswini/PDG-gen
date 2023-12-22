import java.util.Scanner;
import java.util.Arrays;
class Main{
public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
       char[] a = sc.next().toArray();
       for(int i = a.length-1;i>=0;i--){
         System.out.print(a[i]);
         System.out.println();
       }
   }
}