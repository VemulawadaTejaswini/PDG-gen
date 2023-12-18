import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = sc.next();
    String C = sc.next();
    char[] a = A.toCharArray();
    char[] b = B.toCharArray();
    char[] c = C.toCharArray();
    
    int aa = 0;
    int bb = 0;
    int cc = 0;
    char next = a[0];
    while(true){
      if(next == 'a'){
        aa++;
        if(aa == a.length){
          System.out.println("A");
          return;
        }else{
          next = a[aa];
        }
      }else if(next == 'b'){
        bb++;
        if(bb == b.length){
          System.out.println("B");
          return;
        }else{
          next = b[bb];
        }
      }else if(next == 'c'){
        cc++;
        if(cc == c.length){
          System.out.println("C");
          return;
        }else{
          next = c[cc];
        }
      }
    }
    
  }  
}