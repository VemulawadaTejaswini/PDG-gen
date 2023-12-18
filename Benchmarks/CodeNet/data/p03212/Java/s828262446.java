import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int n=calc(String.valueOf(x).length());
    int[] a=new int[n];
    a[0]=3;a[1]=5;a[2]=7;
    int ins=3;
    for(int i=0;i<n;i++){
      if(ins>=n){
        break;
      }else{
        a[ins  ]=a[i]*10+3;
        a[ins+1]=a[i]*10+5;
        a[ins+2]=a[i]*10+7;
        ins+=3;
      }
    }
    int ans=0;
    for(int i=0;i<n;i++){
      if(check(a[i],x)){
//        System.out.println(a[i]);
        ans++;
      }
    }
    System.out.println(ans);
  }
  static int calc(int digit){
    int pow=1;
    int res=0;
    for(int i=1;i<=digit;i++){
      pow*=3;
      res+=pow;
    }
    return res;
  }
  static boolean check(int a,int x){
    if(a>x){
      return false;
    }else{
      boolean t=false;
      boolean f=false;
      boolean s=false;
      while(a>0){
        if(a%10==3){
          t=true;
        }else if(a%10==5){
          f=true;
        }else if(a%10==7){
          s=true;
        }else{
          System.err.println("!!!");
        }
        a/=10;
      }
      return t&&f&&s;
    }
  }
}