import java.util.*;

puclic class Main{
  public static void main(String...args){
  	Scanner s = new Scanner(System.in);
    int n = s.nextInt(); int r = s.nextInt();
    if(s < 10){
      System.out.println(r + 100 * (10 - n));
    }else{
      System.out.println(r);
    }
  }
}