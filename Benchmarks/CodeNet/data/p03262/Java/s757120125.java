import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n=sc.nextInt();
int X=sc.nextInt();
int[] x=new int[n+1];
int[] y=new int[n];
x[0]=X;
for (int i = 0; i < n; i++) {
    x[i+1]=sc.nextInt();
}
for (int i = 0; i < n; i++) {
    y[i]=abs(x[i+1]-x[i]);
}
int ans=y[0];
for (int i = 0; i < n; i++) {
    ans=gcd(ans,y[i]);
}
out.println(ans);
}
static int gcd (int a, int b) {
	int temp;
	while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return b;
}
}