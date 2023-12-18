import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.lang.String.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
String a=sc.next();
String b=sc.next();
a.format("%100d",a);
b.format("%100d",b);
if(a.compareTo(b)>0){
    out.println("GREATER");
}else if(a.compareTo(b)<0){
    out.println("LESS");
}else{
    out.println("EQUAL");
}
}
}