import java.util.*;
public class Main{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
long n=in.nextLong();
long x=in.nextLong();
long a,b,ans;
a=x;b=n-x;
ans=a+b;
if(a<b){
long temp;
temp=b;
b=a;
a=temp;
}
while(b!=0){
ans+=(a/b)*2*b;
a=a%b;
if(a<b){
long temp;
temp=b;
b=a;
a=temp;
}}
ans-=a;
System.out.println(ans);
}
}