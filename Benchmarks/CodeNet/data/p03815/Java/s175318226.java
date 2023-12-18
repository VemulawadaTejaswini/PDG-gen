import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
long x=sc.nextLong();
System.out.println(check(x));
}
static long check(long x){
long ctr=0l;
while(x>0){
x-=6;
ctr++;
if(x<=0)break;
x-=5;
ctr++;
}
return ctr;
}
}