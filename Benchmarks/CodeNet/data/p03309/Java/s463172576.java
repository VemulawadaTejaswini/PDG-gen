import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = sc.nextInt();
int[] B=new int[n+1];
int b;
for (int i = 1; i <= n; i++) {B[i]=sc.nextInt()-i;}
Arrays.sort(B);
if(n%2==0){
    b=(B[n/2]+B[n/2+1])/2;
}else{
    b=B[(n+1)/2];
}
long ans=0;
for (int i = 1; i <= n; i++) {
    ans+=abs(B[i]-b);
}
out.println(ans);
}}