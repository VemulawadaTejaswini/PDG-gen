import java.url.*;
public class smallestnum{
    public static void main(String[] args){
       int A,B,C;
       Scanner scan = new Scanner(System.in);
       if(A==true && B == false)
       {
         System.out.println("A is winner");
       }
      else if(B==true && A == false)
      {
        System.out.println("B is winner");
      }
      else if(A==true && B==true)
      {
        System.out.println("A and B have to contest...");
      }
      else 
      {
        System.out.println("No contest anymore...");
      }
    }
}