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
if(a<b){b=a;}
if(b<c){c=b;}
if(a>b){System.out.println(a+" "+b+" "+c)}
}}


