import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int siz=100001;
    int q=sc.nextInt();
    boolean[] p=new boolean[siz];
    Arrays.fill(p,true);
    boolean[] l=new boolean[siz];
    int[] wa=new int[siz+1];
    p[0]=p[1]=false;
    for(int i=2;i<siz;i++){
      if(!p[i]){
        continue;
      }
      for(int j=i+i;j<siz;j+=i){
        p[j]=false;
      }
    }
    for(int i=1;i<siz;i+=2){
      if(p[i]&&p[(i+1)/2]){
        l[i]=true;
      }
    }
    for(int i=0;i<siz;i++){
      if(l[i]){
        wa[i+1]=wa[i]+1;
      }else{
        wa[i+1]=wa[i];
      }
    }
    for(int i=0;i<q;i++){
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println(wa[b+1]-wa[a]);
    }
  }
}