import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int i=0;
for(;;){
int a=sc.nextInt();
int b=sc.nextInt();
if(a==0 && b==0)break;
if(a>b){i=a;a=b;b=i;}
System.out.println(a+" "+b);}}}