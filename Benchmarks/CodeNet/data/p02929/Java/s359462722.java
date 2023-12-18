import java.util.*;
interface Main{
static void main(String[]$) {
Scanner s=new Scanner(System.in);
int m=1000000007,n=s.nextInt(),c=0,i=2*n;long a=1;
String t=s.next();
while(i-->0)if((t.charAt(i)+i&1)!=0)c++;else a=a*c--%m;
while(n>0)a=a*n--%m;
System.out.print(c>0?0:a);}}