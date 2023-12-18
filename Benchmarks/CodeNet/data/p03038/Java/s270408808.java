import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N,M,i,j;
    N = sc.nextInt();
    M = sc.nextInt();
    int[] a = new int[N];
    int[] b = new int[M];
    int[] c = new int[M];
    for(i=0;i<N;i++)
      a[i] = sc.nextInt();
    for(j=0;j<M;j++){
      b[j] = sc.nextInt();
      c[j] = sc.nextInt();
      if(c[j]>b[j]){
        int temp = a[j];
        a[j] = c[j];
        c[j] = temp;
      }
    }
    for(i=0;i<N;i++)
      s +=a[i];
    System.out.println(s);
  }
}