import java.util.*;

class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
String s1 = sc.next();
String s2 = sc.next();
String s3 = sc.next();
s1 = s1.substring(0,1);
s1 = s1.toUpperCase();
s2 = s2.substring(0,1);
s2 = s2.toUpperCase();
s3 = s3.substring(0,1);
s3 = s3.toUpperCase();
System.out.println(s1 + s2 + s3);


}
}