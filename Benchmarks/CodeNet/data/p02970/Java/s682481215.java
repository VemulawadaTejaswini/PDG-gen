import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    float n = sc.nextFloat();
    float d = sc.nextFloat();
    float nd = n/(2*d);
    int nd2 = (int)n/(2*(int)d);
    if(n%(2*d)>0){
      System.out.println(nd2+1);
    }else{
      System.out.println(nd2);
    } 
  }
}