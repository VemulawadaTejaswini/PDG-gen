import java.util.*;
import java.lang.Math;

class Main{

public static void main(String[] args){
Scanner scanner1 = new Scanner(System.in);
Scanner scanner2 = new Scanner(System.in);
int a=scanner1.nextInt();
int b=scanner1.nextInt();
int c=scanner1.nextInt();
int d=scanner1.nextInt();

int e=Math.max(a*c,Math.max(a*d,Math.max(b*c,b*d)));
System.out.print(e);