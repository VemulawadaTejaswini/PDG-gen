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
int[] y=new int[n];
for (int i = 0; i < n; i++) {
    x[i+1]=sc.nextInt();
}
Arrays.sort(x);
for (int i = 0; i < n; i++) {
    y[i]=abs(x[i+1]-x[0]);
}
Arrays.sort(y);
for (int i = n-1; i >=0; i--) {
    if(y[i]%y[0]!=0){
        out.println(1);exit(0);
    }
}
out.println(y[0]);
}}