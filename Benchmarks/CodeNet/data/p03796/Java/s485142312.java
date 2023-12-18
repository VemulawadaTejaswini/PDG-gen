import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
long ans=1;
long mod=(int)pow(10,9)+7;
int n = Integer.parseInt(sc.next());
for (int i = 1; i <= n; i++) {
ans*=i;
ans=ans%mod;
}
    out.println(ans);
}}