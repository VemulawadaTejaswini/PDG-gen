  import java.util.*;

  public class Main {
      public static void main (String[]args){
          
          Scanner scanner = new Scanner(System.in);
          
          int a = scanner.nextInt();

          scanner.close();

          Scanner scanner2= new Scanner(System.in);

          String s = scanner2.nextLine();

          scanner2.close();

          if (a >= 3200){
            System.out.println(s);
          } else if( a < 3200 ){
            System.out.println("red");
          } 
                  
      }
  } 