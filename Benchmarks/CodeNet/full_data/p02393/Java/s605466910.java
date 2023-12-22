import java.util.Scanner;
public class aizuJudge {
public static void main(String[] args) {
Scanner inp = new Scanner(System.in);
int a = inp.nextInt();
int b = inp.nextInt();
int c = inp.nextInt();
int d;
 
if (a>c){
d = c;
c = a;
a = d;
}
if (b>c){
d = c;
c = b;
b = d;
}
if (a>b){
d = a;
a = b;
b = d;
}
 
System.out.println(a+" "+b+" "+c);
}
}
