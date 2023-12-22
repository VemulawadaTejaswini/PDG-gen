import java.util.*;

public class Main{
  public static void main(String args[]) {
    Scanner in  = new Scanner(System.in);
    String str  = in.next();
    int rnum    = in.nextInt();
    String pstr = "";

    for(int i = 0; i < rnum; i++){
      String order = in.next();
      int start    = in.nextInt();
      int end      = in.nextInt();
      if(order.equals("print")){
        pstr = str.substring(start,end);
        System.out.println(pstr);
      } else if(order.equals("reverse")){
        pstr = str.substring(start+1,end+1);
        StringBuffer sb = new StringBuffer(pstr);
        sb = sb.reverse();
        pstr = str.substring(0,start);
        pstr += sb.toString();
        pstr += str.substring(end+1,str.length());
        str = pstr;
      } else if(order.equals("replace")){
        String re = in.next();
        pstr  = str.substring(0,start);
        pstr += re;
        pstr += str.substring(end+1,str.length());
        str = pstr;
      }
    }
  }
}

