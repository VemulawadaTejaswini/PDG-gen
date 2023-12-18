import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
      String oll = sc.next();String m = oll.substring(5, 7);
      int mo = Integer.parseInt(m);
      
      if(mo<=4){System.out.print("Heisei");}
      else{System.out.print("TBD");}
    }
}