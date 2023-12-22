import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),k=sc.nextInt();
    int count=0;
    if(a>=k){
      count=k;
    }else{
      count=a;
      k-=a;
      if(b<k){
        k-=b;
        count-=k;
      }
    }
    pl(count+"");
  }

  public static int aa(int n){
    if(n>0){return 1;}
    return 0;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
