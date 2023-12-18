import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    
    for(int C=0; C<1000000; C++){
    
       if(100*C <= X && X<=105*C){
         System.out.println(1);
       }
       else{
         System.out.println(0);
       }
    }
  }
}
