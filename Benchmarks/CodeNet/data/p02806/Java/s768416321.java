import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String[] a=new String[n];
    int[] b=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.next();
      b[i]=sc.nextInt();
    }
    String s=sc.next();
    int c=0;
    for(;c<n;c++){
      if(a[i].equals(s)){
        break;
      }
    }
    int ans=0;
    for(int i=c+1;i<n;i++){
      ans+=b[i];
    }
    System.out.println(ans);
  }
}