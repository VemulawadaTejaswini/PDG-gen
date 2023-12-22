import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String a=sc.next();
String b=sc.next();
char c=b.charAt(b.length()-1);
String z=a+(String.valueOf(c));
if(z.equals(b))
System.out.println("Yes");
else
System.out.println("No");

}

}
