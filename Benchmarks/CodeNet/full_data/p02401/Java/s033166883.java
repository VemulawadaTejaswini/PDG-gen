import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a,b;
    String s;
    a = sc.nextInt();
    while(!(s = new String(sc.next())).equals("?")){
      b = sc.nextInt();
      if(s.equals("+"))System.out.println(a+b);
      if(s.equals("-"))System.out.println(a-b);
      if(s.equals("/"))System.out.println(a/b);
      if(s.equals("*"))System.out.println(a*b);
      a = sc.nextInt();
    }
    sc.close();
  }
}

