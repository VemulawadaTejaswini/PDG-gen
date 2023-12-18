import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String c = sc.next();
    int aIndex = 1;
    int bIndex = 0;
    int cIndex = 0;
    char tmp = a.charAt(0);
    while(true){
      switch(tmp){
        case 'a':
          if(a.length() == aIndex){
            System.out.println("A");
            System.exit(0);
          }
          tmp = a.charAt(aIndex++);
          break;
          
        case 'b':
          if(b.length() == bIndex){
            System.out.println("B");
            System.exit(0);
          }
          tmp = b.charAt(bIndex++);
          break;
          
        case 'c':
          if(c.length() == cIndex){
            System.out.println("C");
            System.exit(0);
          }
          tmp = c.charAt(cIndex++);
          break;
      }
    }
  }
}