import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
   public static void main(String[]aa){
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      ArrayList<Integer> array = new ArrayList<>();
      for(int i=0;i<n;i++){
         array.add(sc.nextInt());
         Collections.reverse(array);
      }
      for(int i:array){
         out.print(i + " ");
      }
   }
}