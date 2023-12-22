import java.util.*;
import java.math.*;
class Main{
static BigInteger gcd(BigInteger a,BigInteger b){
while(!(a.equals(BigInteger.ZERO))){
b=b.mod(a);
BigInteger c=new BigInteger(a.toString());
a=new BigInteger(b.toString());
b=new BigInteger(c.toString());
}
return b;}
static BigInteger lcm(BigInteger a,BigInteger b){return a.multiply(b).divide(gcd(a,b));}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
while(true){
int a=s.nextInt();
if(a==0)System.exit(0);
BigInteger bi[]=new BigInteger[a];
for(int i=0;i<a;i++)bi[i]=BigInteger.ONE;
for(int i=0;i<a;i++){
BigInteger b=s.nextBigInteger();
BigInteger c=s.nextBigInteger();
bi[i]=bi[i].multiply(b);
for(int j=0;j<a;j++)
if(i!=j)bi[j]=bi[j].multiply(c);
}
BigInteger res=BigInteger.ONE;
for(int i=0;i<a;i++)res=lcm(res,bi[i]);
for(int i=0;i<a;i++)System.out.println(res.divide(bi[i]).toString());
}}}