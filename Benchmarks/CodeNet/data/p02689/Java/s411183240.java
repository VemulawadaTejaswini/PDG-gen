import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),m = sc.nextInt();
    int h[]=new int[n];
    int count=0;
    boolean flg[]=new boolean[n];
    for(int i=0;i<n;i++){
      h[i]=sc.nextInt();
      flg[i]=true;
    }
    for(int i=0;i<m;i++){
      int a=sc.nextInt()-1,b=sc.nextInt()-1;
      if(h[a]>=h[b]){
        flg[b]=false;
      }
      if(h[a]<=h[b]){
        flg[a]=false;
      }
    }
    for(int i=0;i<n;i++){
      if(flg[i]){count++;}
    }
    pl(count+"");
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
