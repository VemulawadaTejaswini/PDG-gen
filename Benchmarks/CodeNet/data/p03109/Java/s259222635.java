import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int y = Integer.valueOf(s.substring(0,4));
    int m = Integer.valueOf(s.substring(5,7));
    int d = Integer.valueOf(s.substring(8));
    if(y<=2019){
      if(m<=4){
        if(d<=30){
          System.out.println("Heisei");
          return;
        }
      }
    }
    System.out.println("TBD");
  }
}