import java.util.Scanner;
public class Main {
  public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N];
    int counter = 0;
    for(int i=0; i<N; ++i){
      a[i] = sc.nextInt();
    } //とりあえずaに全部代入
    while(true) {
      boolean exist_odd = false;
      for (int i=0; i<N; ++i){
        if(a[i]%2 != 0){
          exist_odd =true;
        }
      }
        //奇数あったら終了
        if(exist_odd){break;}
        //全て偶数なら操作を行う
        for (int i=0; i<N; ++i){
          a[i] /= 2;
          }
          ++counter;



    }

    System.out.println(counter);
  }
}
