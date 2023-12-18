import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String b = scan.next();
    if(b.contains("A")){
    	System.out.print("T");
    }
    else if(b.contains("T")){
      	System.out.print("A");
    }
    else if(b.contains("G")){
    	System.out.print("C");
    }
    else if(b.contains("C")){
    	System.out.print("G");
    }
    scan.close();
  }
}
  