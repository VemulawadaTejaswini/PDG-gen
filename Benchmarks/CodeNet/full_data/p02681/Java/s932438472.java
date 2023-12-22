import java.util.Scanner;

public class Main{
    public static void main(String args[]){

    Scanner scan = new Scanner(System.in);

    String s = scan.nextLine();
    String t = scan.nextLine();

      
    String tt = t.substring(0, s.length());
    System.out.println(s);
    System.out.println(tt);
      
  
      if ( (s.length() == t.length() -1) && (s.equals(tt)) ){
          System.out.println("yes");
      } else {
          System.out.println("no");
      }

      scan.close();
    }
  }