import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int p=Integer.parseInt(sc.next())+Integer.parseInt(sc.next());
if(p>=10){
    out.println("error");
}else{
    out.println(p);
}
}
}