import java.util.Scanner;

public class Main{
    public static void main(String args[]){

    Scanner scan = new Scanner(System.in);

    String s = scan.nextLine();
    String t = scan.nextLine();

      
    String tt = t.substring(0, t.length()-1);

    
      
  
      if ( (s.length() == t.length() -1) && (s.equals(tt)) ){
          System.out.println("Yes");
      } else {
          System.out.println("No");
      }

      scan.close();
    }
  }