import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n=sc.nextInt();
int X=sc.nextInt();
int[] x=new int[n+1];
x[0]=X;
for (int i = 0; i < n; i++) {
    x[i+1]=sc.nextInt();
}
Arrays.sort(x);
int min=1000000000;
for (int i = 0; i < n; i++) {
    min=min(min,abs(x[i+1]-x[i]));
}
for (int i = 0; i < n; i++) {
    if((x[i+1]-x[i])%min!=0){
        out.println(1);
        exit(0);
    }
}
out.println(min);
}}