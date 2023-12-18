Public class Main{

  import java.util.*;

  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    String in = sc.next();
    return in.substring(0,4) + " " + in.substring(4);
  }

}