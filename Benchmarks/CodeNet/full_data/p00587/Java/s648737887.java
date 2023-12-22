import java.util.*;
class Main{
static int[] L,M,N;
public static void main(String[]_){
for(Scanner S=new Scanner(System.in);S.hasNext();){
String o=S.next(),s=S.next(),d=S.next();
int a,b,i,n=s.length(),x=d.length();
L=new int[n*3];
M=new int[x*3];
a=Math.min(n,x);
b=Math.max(n,x);
Arrays.fill(L,0);
Arrays.fill(M,0);
A(L,s);
A(M,d);
if(o.equals("u")){
N=new int[b*3];
for(i=0;i<b;i++)if(L[i]>0||M[i]>0)N[i]++;
}else{
N=new int[a*3];
for(i=0;i<a;i++)if(L[i]>0&&M[i]>0)N[i]++;
}
System.out.println(J(1));
};
}
static String J(int a){
if(N[a]<1)return "";
return "("+J(a*2)+","+J(a*2+1)+")";
}
static void A(int[] a,String s){
int i=0,d=-1,t;
for(char c:s.toCharArray()){
t=(int)Math.pow(2,d);
if (c==40)d++;
if (c==44){if(a[t]>0||a[t/2]>0)a[t+1]++;else a[t]++;}
if (c==41)d--;
i++;
}
}
}