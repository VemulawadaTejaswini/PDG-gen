import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int S = sc.nextInt();
     boolean YYMM,MMYY;
     YYMM = ((S%100>0) &&(S%100<=12));
     MMYY = ((S/100>0) &&(S/100<=12));
     if(YYMM && MMYY){
       System.out.println("AMBIGUOUS");
     }else if(YYMM){
        System.out.println("YYMM");
     }else if(MMYY){
        System.out.println("MMYY");
     }else {
        System.out.println("NA");
      }
   }
}
