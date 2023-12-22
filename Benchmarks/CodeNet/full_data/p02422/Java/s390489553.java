import java.util.*;

public class j19d{
  public static void main(String args[]) {
    Scanner in  = new Scanner(System.in);
    String str  = in.next();
    int rnum    = in.nextInt();
    String pstr;


    for(int i = 0; i < rnum; i++){
      pstr = "";
      String order = in.next();
      int start    = in.nextInt();
      int end      = in.nextInt();
      if(order.equals("print")){
        pstr = str.substring(start,end+1);
        System.out.println(pstr);
      } else if(order.equals("reverse")){
        pstr = str.substring(start+1,end+1);
        StringBuffer sb = new StringBuffer(pstr);
        sb = sb.reverse();
        pstr = str.substring(0,start);
        pstr += sb.toString();
        pstr += str.substring(end,str.length());
        //tstr.reverse();
      } else if(order.equals("replace")){

      }
    }
  }
}
xyz
2
reverse 0 2
print 0 2

xyz
k17118kk:AOJ k17118kk$ java j19d
abcd
2
reverse 1 2
print 0 3

