import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();  // input Integer
//    String a = sc.next();  // input String
    int count = 0;
    for(int i =1; i<=a; i++){
      int b=sc.nextInt();
      if (i%2==1 && b%2==1){
        count++;
      }
    }
    System.out.println(count);
  }
}
