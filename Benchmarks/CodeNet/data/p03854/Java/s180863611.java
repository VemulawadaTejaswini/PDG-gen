import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s=sc.next();
StringBuffer sb=new StringBuffer(s);
s=sb.reverse().toString();
s=s.replaceAll("maerd", "-");
s=s.replaceAll("esare", "-");
s=s.replaceAll("resare", "-");
s=s.replaceAll("remaerd", "-");
s=s.replaceAll("-","");
if(s.equals("")){System.out.println("YES");}else{System.out.println("NO");}
}}