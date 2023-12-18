import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String a = S.substring(5,7);
    
      if(a.equals ("04")||a.equals ("03")||a.equals ("02")||a.equals ("01")){
	System.out.println("Heisei");
      }else{
	System.out.println("TBD");
    }
      }
}