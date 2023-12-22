import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String t = sc.next();
    for(int i=0 ; i<t.length() ; i++){
      if(i==0){
        if(t.charAt(0) == '?'){
          if(t.charAt(i+1) == 'D'){
            System.out.print("P");
          }else{
            System.out.print("D");
          }
        }else{
          System.out.print(t.charAt(0));
        }
      }else{
        if(t.charAt(i)=='?'){
          if(t.charAt(i-1) == 'P'){
          // char t.charAt(i) = 'P';
            System.out.print("D");
          }else if(t.charAt(i+1) == 'D'){
            System.out.print("P");
          }else if(t.charAt(i-1) == 'D'){
            System.out.print("P");
          }else{
            System.out.print("D");
          }
        }else{
          System.out.print(t.charAt(i));
        }
      }
    }
    System.out.println();
  }
}
