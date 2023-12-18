import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int cnt=0;
    int h=0;
    int N = scan.nextInt();
    int M = scan.nextInt();
    int a[] = new int[N];
    for(int i=0;i<N;i++){
      a[i]=scan.nextInt();
      cnt+=a[i];
    }
    cnt*=4;
    cnt/=1;
    for(int i=0;i<N;i++){
      if(a[i]<cnt)h++;
      if(h>M){
        System.out.printf("No");
        break;
      }
      if(i==N-1){
      System.out.printf("Yes");
      }
    }
  }
}