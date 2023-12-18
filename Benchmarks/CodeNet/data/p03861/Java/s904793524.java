import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
long a=Long.parseLong(sc.next());
long b=Long.parseLong(sc.next());
long x=Long.parseLong(sc.next());
if(a==0){System.out.println(b/x+1);}else{
System.out.println(b/x-(a-1)/x);
}
}}