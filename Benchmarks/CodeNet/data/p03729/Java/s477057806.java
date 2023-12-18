import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	String a = sc.next();
   	String b = sc.next();
   	String c = sc.next();
    String af=a.substring(a.length()-1,);
    String bb=b.substring(0,1);
    String bf=b.substring(b.length()-1,);
    String cb=c.substring(0,1);
    if (af.equals(bb) && bf.equals(cb)){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}