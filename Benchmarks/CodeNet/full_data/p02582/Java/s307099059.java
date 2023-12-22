import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new.Scanner(System.in);
    String s = scan.next();
    if (s == "RRR"){
      System.out.println(3);
    }else if (s == "RRS"){
      System.out.println(2);
    }else if (s == "SRR"){
      System.out.println(2);
    }else if (s == "RSR"){
      System.out.println(1);
    }else if (s == "RSS"){
      System.out.println(1);
    }else if (s == "SRS"){
      System.out.println(1);
    }else if (s == "SSR"){
      System.out.println(1);
    }else{
      System.out.println(0);
    }
  }
}
