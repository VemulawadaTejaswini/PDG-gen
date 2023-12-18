import java.util.*;
public class Main {
 public static void main(String...args) {
  final java.util.Scanner sc = new java.util.Scanner(System.in);
   final int count = sc.nextInt();
   Integer[] array = new Integer[count];
   for(int i=0;i<count;i++)array[i] = sc.nextInt();
   Arrays.sort(array,Comparator.reverseOrder());
   int ans = 0;
   for(int j=0;j<count;j++){
     int price = 0;
     if(j==0){
       price = array[j]/2;
     }else{
       price = array[j];
     }
     ans+=price;
   }
   System.out.println(ans);
 }
}