import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int f=Integer.parseInt(s.substring(0,2));
    int b=Integer.parseInt(s.substring(2));
    if(0<f&&f<13){
      if(0<b&&b<13){
        System.out.println("AMBIGUOUS");
      }else{
        System.out.println("MMYY");
      }
    }else{
      if(0<b&&b<13){
        System.out.println("YYMM");
      }else{
        System.out.println("NA");
      }
    }
  }
}
