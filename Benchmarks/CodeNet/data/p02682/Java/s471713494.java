import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
   	int b = sc.nextInt();
	int c = sc.nextInt();
    int d = sc.nextInt();
    if (a >= d){
      System.out.println(d);
    } else if (a + b >= d){
      System.out.println(a);
    } else {
      int num=a-(d-a-b);
      System.out.println(num);
    }
  }
}