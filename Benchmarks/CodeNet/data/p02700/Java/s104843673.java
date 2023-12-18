import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
      int A = Integer.parseInt(sc.next());
      int B = Integer.parseInt(sc.next());
      int C = Integer.parseInt(sc.next());
      int D = Integer.parseInt(sc.next());
      
      boolean takasugiWin = false;
      while(A > 0){
        C -= B;
        if(C <= 0){
          takasugiWin = true;
          break;
        }
        A -= D;
      }
      String kotae = takasugiWin ? "Yes" : "No";

      System.out.println(kotae);
    }  
}
