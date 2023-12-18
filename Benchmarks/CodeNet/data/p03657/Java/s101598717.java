import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int a = Integer.parseInt(sc.next());
int b = Integer.parseInt(sc.next());
String ans="";
if(a%3==0||(a+b)%3==0||b%3==0){ans="Possible";}else{ans="Impossible";}
    out.println(ans);
}
}