import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	String a = sc.next();
    int count=0;
    for (int i = 0 ; i<3 ; i++) {
      if (a.substring(i,i+1).equals("o")) {
        count++;
      }
    }
    System.out.println(700+count*100);
  }
}
