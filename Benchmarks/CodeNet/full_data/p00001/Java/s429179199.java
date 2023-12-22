import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    int[] array = new int[10];
    for (int i = 0; i < 10; i++){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      array[i] = n;   
    }
  Arrays.sort(array);
  System.out.println(array[9]);
  System.out.println(array[8]);
  System.out.println(array[7]);
  }
}