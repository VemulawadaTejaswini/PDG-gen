import java.util.*;

public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      String b = sc.next();
      String c = sc.next();
      int alen = a.length();
      String al = a.substring(alen-1,alen);
      String bf = b.substring(0,1);
      int blen = b.length();
      String bl = b.substring(blen-1,blen);
      String cf = c.substring(0,1);
      if(al.equals(bf) && bl.equals(cf)){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
  }
}