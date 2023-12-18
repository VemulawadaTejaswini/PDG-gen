import java.util.*;
class main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int d[] = new int[N];
    int ans = 0;
    int tmp = 0;
    for(int i=0;i<N;i++){
      d[i]=sc.nextInt();
    }
    for(int i=0;i<N;i++){
      tmp += d[i]*d[i];
      for(int j=0;j<i;j++){
        ans+=d[i]*d[j];
      }
    }
    ans-=tmp;
    System.out.print(ans);
  }
}
import java.util.*;
class main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] d = new int[N];
    int ans = 0;
    int tmp = 0;
    for(int i=0;i<N;i++){
      d[i]=sc.nextInt();
    }
    for(int i=0;i<N;i++){
      tmp += d[i]*d[i];
      for(int j=0;j<i;j++){
        ans+=d[i]*d[j];
      }
    }
    ans-=tmp;
    System.out.print(ans);
  }
}
提出情報