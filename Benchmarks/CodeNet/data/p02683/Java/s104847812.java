import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),m = sc.nextInt(),x=sc.nextInt();
    int rikai[]=new int[m];
    int money[]=new int[n];
    int book[][]=new int[n][m];
    int min =-1;
    for(int i=0;i<n;i++){
      money[i]=sc.nextInt();
      for(int j=0;j<m;j++){
        book[i][j]=sc.nextInt();
      }
    }
    min = search(0,n,m,x,0,rikai,money,book,-1);
    pl(min+"");
  }

  public static int search(int now,int n,int m,int x,int nowm,int[]rikai,int money[],int[][]book,int min){
    boolean flg=true;
    nowm+=money[now];
    for(int i=0;i<m;i++){
      rikai[i]+=book[now][i];
      if(rikai[i]<x){
        flg=false;
      }
    }
    if(flg){
      for(int i=0;i<m;i++){
        rikai[i]-=book[now][i];
      }
      if(min==-1||min>nowm){
        return nowm;
      }else{
        return min;
      }
    }
    for(int i=now+1;i<n;i++){
      min = search(i,n,m,x,nowm,rikai,money,book,min);
    }
    for(int i=0;i<m;i++){
      rikai[i]-=book[now][i];
    }
    nowm-=money[now];
    if(now!=n-1){
      min = search(now+1,n,m,x,nowm,rikai,money,book,min);
    }
    return min;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
