import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
long x=sc.nextLong();
long y=sc.nextLong();
int a=0,ans=0;
while((long)(pow(2,a)*x)<=y){
    a++;ans++;
}
    out.println(ans);
}}