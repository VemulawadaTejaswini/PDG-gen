import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int n = sc.nextInt();
int k = sc.nextInt();
if(k%2!=0){
    out.println((long)pow(n/k,3));
}else{
    int temp=0,t=0;
    for (int a = 1; a <= n; a++) {
        if(a%k==k/2)temp++;
        if(a%k==0)t++;
    }
    out.println((long)pow(temp,3)+(long)pow(t,3));
}
}}