import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int min=n;
    for(int i=1;i<n;i++){
      min=Math.min(calc(i)+calc(n-i),min);
    }
    System.out.println(min);
  }
  static int calc(int a){
    int res=0;
    while(a>0){
      res+=a%10;
      a/=10;
    }
    return res;
  }
}