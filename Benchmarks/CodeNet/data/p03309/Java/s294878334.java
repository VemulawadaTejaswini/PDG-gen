import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = sc.nextInt();
long[] a=new long[n];
long[] B=new long[n];
long b;
for (int i = 1; i < n; i++) {a[i]=sc.nextLong();B[i]=a[i]-i-1;}
Arrays.sort(B);
b=B[n/2];
long ans=0;
for (int i = 1; i <= n; i++) {
    ans+=abs(a[i]-b-i);
}
out.println(ans);
}}