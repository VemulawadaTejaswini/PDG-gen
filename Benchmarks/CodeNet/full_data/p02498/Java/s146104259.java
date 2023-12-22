import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    scan.useDelimiter("\n");
    String str = scan.next();
    for(int i=0;i<str.length();i++){
      char c = str.charAt(i);
      if('a' <= c && c <= 'z'){
        out.print((char)(c - ('a'-'A')));
      }else if('A' <= c && c <= 'Z'){
        out.print((char)(c + ('a'-'A')));
      }else
        out.print(c);
    }
    out.println();
  }
}