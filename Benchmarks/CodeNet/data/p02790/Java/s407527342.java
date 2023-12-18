import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner I = new Scanner(System.in);
    int a =I.nextInt();
    int b =I.nextInt();
    if(a>=b){
      System.out.println( ((10^a-1)*b/9));}
    else{System.out.println(((10^b-1)*a/9));}
  }
}