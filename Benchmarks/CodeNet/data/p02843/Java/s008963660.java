import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    double c = X/100;
    int C = (int)c;
    
    
       if(100*C <= X && X<=105*C){
         System.out.println(1);
       }
       else{
         System.out.println(0);
       }
    
  }
}