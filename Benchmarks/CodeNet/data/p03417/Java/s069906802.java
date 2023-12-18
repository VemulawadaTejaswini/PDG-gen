import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
  int n=sc.nextInt();
  int m=sc.nextInt();
m=min(m,n);
n=max(m,n);
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
