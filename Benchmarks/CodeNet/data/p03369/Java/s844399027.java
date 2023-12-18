import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char c[] = new char[3];
    for(int i=0 ; i<3 ; i++){
      c[i] = s.charAt(i);
    }
    Arrays.sort(c);
    String t = new String(c);
    if(t.equals("ooo")){
      System.out.println("1000");
    }else if(t.equals("oox")){
      System.out.println("900");
    }else if(t.equals("oxx")){
      System.out.println("800");
    }else if(t.equals("xxx")){
      System.out.println("700");
    }
  }
}
