import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
StringBuilder str = new StringBuilder();
int z = 0;
while(true){
int x = scan.nextInt();
String op = scan.next();
int y = scan.nextInt();

if(op == "?") break;

if(op == "+") z=x+y;
if(op == "-") z=x-y;
if(op == "*") z=x*y;
if(op == "/") z=x/y;

str.append(z+"\n");
}

System.out.print(str);
}
}