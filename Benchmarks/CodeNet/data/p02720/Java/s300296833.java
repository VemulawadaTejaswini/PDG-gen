import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    if(k<=9){
      pl(k+"");
    }else{
      long count=9;
      for(int ij=2;;ij++){
        long l=0;
        for(int i=1;i<=9&&count<k;i++){
          long ll[] = deside(i,2,ij,count,k);
          count = ll[1];l=i*ten(ij)+ll[0];
        }
        if(count==k){
          pl(l+"");
          break;
        }
      }
    }
  }

  public static long[] deside(int b,int n,int max,long count,int k){
    for(int i=max(b-1,0);i<=b+1&&i<=9;i++){
      if(n==max){
        count++;
        if(count==k){
          return new long[]{i,k};
        }
        if(i==b+1||i==9){
          return new long[]{0,count};
        }
      }else{
        long lo[] = deside(i,n+1,max,count,k);
        count = lo[1];
        if(count==k){
          lo[0]=i*ten(max-n+1)+lo[0];
          return lo;
        }
        if(i==b+1||i==9){
          return lo;
        }
      }
    }
    return new long[]{0,0};
  }

  public static int getNum(long a,int n){
    return (int)(a/ten(n))%10;
  }

  public static int max(int a,int b){
    if(a>b){return a;}
    else{return b;}
  }

  public static long ten(int n){
    long a=1;
    for(int i=1;i<n;i++){
      a*=10;
    }
    return a;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
