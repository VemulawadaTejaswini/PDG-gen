import java.util.Scanner;
class SearchString{
public static void main(String[] args){
Scanner stdIn = new Scanner(System.in);
String n = stdIn.next();
String s1 = "AtCoder";
if (n == s1)
System.out.println("AC");
else 
System.out.println("WA");
}
}