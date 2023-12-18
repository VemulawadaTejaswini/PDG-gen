import java.util.*;

class Main{
  static int repow(int b,int p){
    System.err.println(b+"^"+p);
    int res=1;
    int a=b;
    while(p>0){
      if((p&1)==1){
        res*=a;
      }
      a*=a;
      p/=2;
    }
    System.err.println("="+res);
    return res;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int gu=0;
    int ki=0;
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      if((a[i]&1)==0){
        gu++;
      }else{
        ki++;
      }
    }
    System.out.println(repow(3,n)-repow(2,gu));
    System.err.println(repow(3,n)+"-"+repow(2,gu));
  }
}