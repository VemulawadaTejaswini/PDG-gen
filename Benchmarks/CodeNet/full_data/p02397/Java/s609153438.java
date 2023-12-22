import java.util.Scanner;

class Main{
public static void main(String[] args){
Scanner stdIn = new Scanner(System.in);

int a = stdIn.nextInt();
int b = stdIn.nextInt();
while(a!=0||b!=0){
if (a<b){
System.out.println(a + " " + b);
} else {
System.out.println(b + " " + a);
}
a = stdIn.nextInt();
b = stdIn.nextInt();
}
}
}
