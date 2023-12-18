import java.util.Scanner;
public class Main{
  public static void main(){
    Scanner sc = new Scanner(System.in);
    int N,M,i,j,t;
    N = sc.nextInt();
    M = sc.nextInt();
    int count = 0;
    int[] p = new int[M];
    int[] k = new int[M];
    for(i=0;i<M;i++){
      k[i] = sc.nextInt();
      int[] s = new int[k[i]];
      for(j=0;j<k[i];j++){
        s[j] = sc.nextInt();
      }
    }
    for(t=0;t<M;t++)
      p[t] = sc.nextInt();
    for(i=0;i<M;i++){
      for(j=0;j<k[i];j++){
        if((s[j]%2)==(p[i]%2))
          count++:
      }
    }
    System.out.println(count);
  }
}
    