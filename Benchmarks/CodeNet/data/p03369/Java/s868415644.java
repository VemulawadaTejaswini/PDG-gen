import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int cost = 700;
    for(int i=0;i<3;i++){
      if(s.charAt(i)=='o'){
        cost+=100;
      }
    }
    System.out.println(cost);
  }
}
