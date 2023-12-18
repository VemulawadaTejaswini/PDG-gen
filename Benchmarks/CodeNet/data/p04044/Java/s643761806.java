import java.util.*;
class Main{
  public static void main(String[]a){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int i=s.nextInt();
    a=new String[n];
    for(i=0;i<n;i++)a[i]=s.next();
    Arrays.sort(a);
    for(i=0;i<n;i++)System.out.print(a[i]);
  }
}