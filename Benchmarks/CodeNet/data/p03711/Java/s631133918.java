
import java.util.Scanner;

public class Main{
  public static void main(String[] args){

   Scanner sc = new Scanner(System.in);

   int x = sc.nextInt();
   int y = sc.nextInt();

   int[] array = {0,2,0,1,0,1,0,0,1,0,1,0};

   if(array[x - 1] == array[y - 1]){
     System.out.println("Yes");
   }else{
    System.out.println("No");
   }
  }
}