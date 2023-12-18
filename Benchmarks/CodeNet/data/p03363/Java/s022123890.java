import java.util.*;
import static java.lang.System.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = sc.nextInt();
long[] a=new long[n+1];
a[0]=0;
for(int i=1;i<=n;i++){a[i]=a[i-1]+sc.nextLong();}
int ans=0;
for(int i=n;i>0;i--){
for(int j=i-1;j>=0;j--){
if(a[i]-a[j]==0)ans++;
}}
out.println(ans);
}}