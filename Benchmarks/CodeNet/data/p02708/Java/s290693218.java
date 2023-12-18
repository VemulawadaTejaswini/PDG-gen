import java.util.*;
class Main{
  static final long mmod = 1000000007;
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),k=sc.nextInt();
    long count = 0;
    if(k==1){count+=n+1;}
    long min = 0,max=n-1;
    for(int i=2;i<=n+1;i++){
      min+=i-1;
      max+=n;
      if(i>=k){
        count=get(count+get(max-min+1));
      }
      max-=i;
    }
    pl(count+"");
  }


  public static long get(long a){
    return a%mmod;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
