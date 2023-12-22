import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String t = scan.next();
        scan.close();
        String[] c = t.split("");
        String res = "";
        for(int i=0; i<c.length; i++) {
          if( c[i].equals("P") ) {
            res += "P";
          }else if( c[i].equals("D") ){
            res += "D";
          }else{
            if( i == c.length-1) {
              res += "D";
              continue;
            }
            if( c[i+1].equals("?") ){
              res += "PD";
              i++;
            }else if( c[i+1].equals("D") ){
              res += "PD";
              i++;
            }else{
              res += "D";
            }
          }
        }
        System.out.println(res);
    }
}