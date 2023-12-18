import java.util.*;
class Main{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int c = 0;
      for(int i = 0; i < 3; i++){
        if(s.charAt(i) == 'A')
          c++;
      }
      if(c == 0 || c == 3)
        System.out.println("NO");
      else
        System.out.ptintln("YES");
  }
}