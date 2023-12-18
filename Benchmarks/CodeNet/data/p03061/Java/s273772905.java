import java.util.*;
class Main{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
long a[]=new long[n];
long f[]=new long[n];
long b[]=new long[n];
for(int i=0;i<n;i++) a[i]=Long.parseLong(sc.next());
for(int i=0;i<n;i++){
if(i==0){
f[i]=a[i];
b[n-i-1]=a[n-i-1];
}
else{
f[i]=gcd(f[i-1], a[i]);
b[n-i-1]=gcd(b[n-i], a[n-i-1]);
}
}
long ans=1;
for(int i=0;i<n;i++){
if(i==0) ans=Math.max(ans, b[i+1]);
else if(i==n-1) ans=Math.max(ans, f[i-1]);
else ans=Math.max(ans, gcd(f[i-1], b[i+1]));
}
System.out.println(ans);
}
static long gcd(long a, long b){
if(a<b) return gcd(b, a);
long r=a%b;
while(r>0){
a=b;
b=r;
r=a%b;
}
return b;
}

}