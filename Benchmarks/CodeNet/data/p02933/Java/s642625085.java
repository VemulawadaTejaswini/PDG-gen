import java.util.Scanner;
public class Main{
    
public static void main( String args[]) {
  Scanner sc = new Scanner(System.in);
   String s ;
   
   int n = sc.nextInt();
    s = sc.nextLine().toLowerCase();
  
    if(n<3200 && n>=2800)
    System.out.println("red");
    else if(n >3200 && n<5000)
    System.out.println(s);
 
}
  
         
    }