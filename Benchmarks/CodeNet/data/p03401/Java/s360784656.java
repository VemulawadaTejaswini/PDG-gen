import java.util.*;

public class Main {
public static void main(String[] args){
  Scanner in=new Scanner(System.in);
  int n=in.nextInt();
  int[] a=new int[n+2];
  int ans=0;
  a[0]=0;
  a[n+1]=0;
  for(int i=1;i<=n;i++){
   a[i]=in.nextInt();
  ans+=Math.abs(a[i]-a[i-1]);
}
 ans+=Math.abs(a[n+1]-a[n]);
for(int i=1;i<=n;i++){
int ans1=ans-Math.abs(a[i]-a[i-1])-Math.abs(a[i+1]-a[i])+Math.abs(a[i+1]-a[i-1]);
System.out.println(ans1);
}


}
}