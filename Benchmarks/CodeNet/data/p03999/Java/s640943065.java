import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int s= sc.nextInt();
long[] a=new long[11];
long[] b=new long[11];
long ans=0;
b[0]=1;
int j=1;
    for (int i = 0; i <10; i++) {
        a[i]=s%10;
        s/=10;
        if(i>0){
            b[i]=b[i-1]*10+j;
            j*=2;
        }
    }
    ans=a[0];
    int k=1;
    while(a[k]!=0){
        ans=ans*2+a[k]*b[k];
        k++;
    }
    out.println(ans);
}}