import java.util.Scanner;

class Main{
public static void main(String[] args){

 int a;
 int b;
 int c;

Scanner s = new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if(a>b){if(c>a)System.out.println(b+" "+a+" "+c);}
else if(c<b){System.out.println(c+" "+b+" "+a);}
else{System.out.println(b+" "+c+" "+a)}}else
{if(c<a){System.out.println(c+" "+a+" "+b);}else if(c>b){System.out.println(a+" "+b+" "+c)}
else{System.out.println(a+" "+c+" "+b);}
}
}
}
