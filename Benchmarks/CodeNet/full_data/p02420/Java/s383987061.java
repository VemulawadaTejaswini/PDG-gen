import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 while (true) {
String str = sc.next(); 
if (str.equals("-")) {
break; }
int n = sc.nextInt();
for(int i=0;i<n;i++){
int a= sc.nextInt();
str = str.substring(a)+str.substring(0,a);
}
System.out.println(str);
}}}
