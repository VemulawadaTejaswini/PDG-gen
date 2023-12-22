import java.util.Scanner;
class Main{
public static void main (String[] args){
Scanner scan = new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
if(a==b||b==c||a==c){
System.out.println("No");
}else if(a>b||a>c){
System.out.println("No");
}else if(b>c){
System.out.println("No");
}else{
System.out.println("Yes");
}
}
}