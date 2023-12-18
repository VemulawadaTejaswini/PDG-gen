import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
  int n=sc.nextInt();
  int m=sc.nextInt();
int temp1=max(m,n);
int temp2=min(m,n);
n=temp1;
m=temp2;
long ans=0;
if(m==1&&n==1){
ans=1;
}else if(m==1){
ans=n-2;
}else{
ans=(m-2)*(n-2);
}
outt.println(ans);
}
}
