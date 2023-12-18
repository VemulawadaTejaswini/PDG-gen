import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
    if (a==3 || a==5 || a==7){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}