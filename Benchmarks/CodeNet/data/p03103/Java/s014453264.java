import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    I[] a=new I[n];
    for(int i=0;i<n;i++){
      a[i]=new I(sc.nextInt(),sc.nextInt());
    }
    Arrays.sort(a,(s1,s2)->s1.p-s2.p);
//    System.out.println(Arrays.toString(a));
    long k=0;
    long c=0;
    for(int i=0;i<n;i++){
//      System.out.println(a[i]);
      if(a[i].k+k>=m){
        c+=(m-k)*a[i].p;
        break;
      }else{
        k+=a[i].k;
        c+=a[i].k*a[i].p;
      }
//      System.out.println("k"+k+" c"+c);
    }
    System.out.println(c);
  }
  static class I{
    int p;
    int k;
    I(int p,int k){
      this.p=p;
      this.k=k;
    }
    public String toString(){
      return String.valueOf(p)+":"+String.valueOf(k);
    }
  }
}