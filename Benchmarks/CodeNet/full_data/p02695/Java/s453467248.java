import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),m = sc.nextInt(),q = sc.nextInt();
    int qu[][]=new int[q][4];
    int a[]=new int[n];
    for(int i=0;i<q;i++){
      for(int j=0;j<4;j++){
        qu[i][j]=sc.nextInt();
      }
    }

    pl(search(n-1,0,m,a,qu,0)+"");
  }

  public static int search(int n,int now,int max,int a[],int qu[][],int high){
    int min=0;
    if(now==0){min=1;}else{min=a[now-1];}
    for(int i=min;i<=max;i++){
      a[now]=i;
      if(now==n){
        int score=0;
        for(int j[]:qu){
          if(a[j[1]-1]-a[j[0]-1]==j[2]){
            score+=j[3];
          }
        }
        high = Math.max(high,score);
      }else{
        high = search(n,now+1,max,a,qu,high);
      }
    }
    return high;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
