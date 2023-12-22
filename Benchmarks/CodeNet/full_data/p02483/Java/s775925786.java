import java.util.*;
public class Main{
public static void main(String[] args){
Scanner kbd = new Scanner(System.in);

int a = kbd.nextInt();
int b = kbd.nextInt();
int c = kbd.nextInt();
int w;

if(a>b) {w=b; b=a; a=w;}
if(b>c) {w=b; b=c; c=w;}
if(a>c) {w=a; a=c; c=w;}

System.out.println(a+" "+b+" "+c);

}
}