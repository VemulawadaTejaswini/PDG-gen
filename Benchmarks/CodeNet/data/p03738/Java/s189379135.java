import java.util.*;
import java.awt.*;
import java.math.BigInteger;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        String s1=sc.next();
        String s2=sc.next();
        BigInteger a1=new BigInteger(s1);
        BigInteger a2=new BigInteger(s2);
        if(a1.compareTo(a2)>0){
            out.println("GREATER");
        }else if(a1.compareTo(a2)==0){
            out.println("EQUAL");
        }else{
            out.println("LESS");
        }
    }
}