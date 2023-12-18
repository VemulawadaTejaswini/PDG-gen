import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
if(n>=k)out.println((n-k)*x+k*y);
if(n<k)out.println(n*x);
}}