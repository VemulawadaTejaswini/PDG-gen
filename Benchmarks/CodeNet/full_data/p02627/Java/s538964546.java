import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    
      char c=obj.next().charAt(0);
      if(Character.isLowerCase(c))
        System.out.println("a");
      else
        System.out.println("A");
    
  }
}