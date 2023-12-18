import java.util.*;

class Main{
  public static void main(String[] a){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    for(int i=0;i<s.length()-1;i++){
      if(s.charAt(i) == 'h'){
        if(s.charAt(i+1) == 'i'){
          System.out.print("Yes");
          return;
        }
      }
    }
    System.out.print("No");
  }
}