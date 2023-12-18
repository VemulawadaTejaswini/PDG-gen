import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
int k = sc.nextInt();
int ans=0;
if(k%2==1){
    ans=k/2*(k/2+1);
}else{
    ans=k*k/4;
}
    out.println(ans);
}}