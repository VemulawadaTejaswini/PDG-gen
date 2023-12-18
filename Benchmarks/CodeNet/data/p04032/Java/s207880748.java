import java.util.*;
public class Main
{
public static void main(String[] args)
{
 
Scanner sc=new Scanner(System.in);
String s=sc.next();
int a=0;
int b=1;
if(s.length()==1)
System.out.println(-1+" "+-1);
else if(s.charAt(a)==s.charAt(b))
{
    System.out.println(0+" "+1);
}
else if(s.length()==2)
{
    System.out.println(-1+" "+-1);
}
else{
for(int i=2;i<s.length();i++)
{
    if(s.charAt(a)==s.charAt(i))
    {
        System.out.println(a+" "+i);
        break;
    }
    if(s.charAt(b)==s.charAt(i))
    {
       System.out.println(b+" "+i);
        break; 
    }
    if(i==s.length()-1)
    {
        System.out.println(-1+" "+-1);
    }
    a=b;
    b=i;
}}}}