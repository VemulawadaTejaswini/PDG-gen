import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long p=1000000007;
    Long summer=(long)0;
    Long ans=(long)0;
    Long[] a=new long[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextLong();
      summer+=a[i];
      summer%=p;
    }
    for(int i=0;i<n;i++){
      summer-=a[i];
      if(summer<0)summer+=p;
      ans+=(a[i]*summer)%p;
    }
    System.out.println(ans);
  }
}