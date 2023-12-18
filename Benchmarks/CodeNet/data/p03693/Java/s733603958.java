import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt()*100+sc.nextInt()*10+sc.nextInt();
System.out.println(x%4==0?"YES":"NO");
}}
