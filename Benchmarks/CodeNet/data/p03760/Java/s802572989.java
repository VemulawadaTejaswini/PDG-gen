import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String O = sc.next();
    String E = sc.next();
    for(int i=0;i<O.length()-1;i++){
      System.out.print(O.substring(i,i+1));
      System.out.print(E.substring(i,i+1));
    }
    System.out.print(O.substring(O.length()-1,O.length()));
    if(O.length()==E.length()){
      System.out.print(E.substring(E.length()-1,E.length()));
    }
                     
  }
  

  
}
