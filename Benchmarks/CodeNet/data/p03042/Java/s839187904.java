import java.util.*;
import java.lang.*;
public class Main2 {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String b = sc.next();

      String c = b.substring(0,2);
      Integer d = Integer.valueOf(c);
      String e = b.substring(2,4);

      Integer f = Integer.valueOf(e);
      if(d >= 1 && d <=12 && f >=1 && f <=12){
          System.out.println("AMBIGUOUS");
      }
      if((d >= 1 && d <=12 ) && (f ==0 || f >12)){
          System.out.println("YYMM");
      }
      if((d ==0 || d >12) && (f>=1 && f <= 12)){
          System.out.println("MMYY");
      }
      if((d ==0 || d >12) && (f ==0 || f >12)){
          System.out.println("NA");
      }

//      b =
//      ArrayList<Integer> array = new ArrayList<Integer>();
//      array.add(b[0]);
//      array.add(b[1]);
//
//      int b = sc.nextInt();

  }
}
