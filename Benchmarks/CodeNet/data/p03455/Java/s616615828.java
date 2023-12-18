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
    if ((a*b)%2==1) {
      System.out.println("Odd");
    } else {
      System.out.println("Even");
    }
  }
}