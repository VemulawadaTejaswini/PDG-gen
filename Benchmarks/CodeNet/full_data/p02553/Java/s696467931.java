import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long[] a=new Long[2];
    a[0]=sc.nextLong();
    a[1]=sc.nextLong();
    long[] c=new Long[2];
    c[0]=sc.nextLong();
    c[1]=sc.nextLong();
    long max=0;
    for(int i=0;i<2;i++){
      for(int j=0;j<2;j++){
        if(max<a[i]*c[j])max=a[i]*c[j];
      }
    }
    System.out.println(max);
  }
}