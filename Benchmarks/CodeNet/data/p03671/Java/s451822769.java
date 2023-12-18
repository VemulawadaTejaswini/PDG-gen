import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] array=new int[3];
	array[0] = sc.nextInt();
	array[1] = sc.nextInt();
	array[2] = sc.nextInt();
    int max = Math.max(array[0],array[1]);
    max = Math.max(max,array[2]);
    System.out.println(array[0]+array[1]+array[2]-max);
  }
}