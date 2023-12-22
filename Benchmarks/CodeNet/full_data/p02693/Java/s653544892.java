import java.util.*;
public class Main{

  
  
  public static void main(String[] args){
  
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    int ss=s.nextInt();
    if(  (int)(k/n) == (int)(ss/n)  ){
    System.out.println("NG");}else{System.out.println("OK");}
  
  }
  
}