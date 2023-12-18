import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String A = sc.nextLine();
    String B = sc.nextLine();
    String C = sc.nextLine();
    String turn = "A";
    
    while(true){
      if(turn.equals("A")){
        if(A.length() == 0){
          break;
        }
        
        char z = A.charAt(0);
        A = A.substring(1, A.length());
        if(z == 'a'){
          turn = "A";
        }else if(z == 'b'){
          turn = "B";
        }else{
          turn = "C";
        }
      }else if(turn.equals("B")){
        if(B.length() == 0){
          break;
        }
        
        char z = B.charAt(0);
        B = B.substring(1, B.length());
        if(z == 'a'){
          turn = "A";
        }else if(z == 'b'){
          turn = "B";
        }else{
          turn = "C";
        }
      }else{
        if(C.length() == 0){
          break;
        }
        
        char z = C.charAt(0);
        C = C.substring(1, C.length());
        if(z == 'a'){
          turn = "A";
        }else if(z == 'b'){
          turn = "B";
        }else{
          turn = "C";
        }
      }
    }
    System.out.println(turn);
  }
}