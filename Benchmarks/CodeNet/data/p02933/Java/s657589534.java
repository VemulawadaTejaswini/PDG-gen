import java.util.Scanner;
public class Main{
    
public static void main( String args[]) {
  Scanner sc = new Scanner(System.in);
   String s ;
   
   int n = sc.nextInt();
    s = sc.nextLine();
  int x =  s.length();
    if(n<3200 && n>=2800)
    System.out.println("red");
    else
    System.out.println(s);
  }
}
  
         
    }