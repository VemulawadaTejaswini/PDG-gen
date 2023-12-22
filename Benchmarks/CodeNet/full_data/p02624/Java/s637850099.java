import java.util.Scanner;
 
public class Main {
  public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int total=0;
    int[] yakusu=new int[N];
    for (int i=0;i<N;i++) {
      int n=0;
      for (int j=1;j<=(i+1);j++){
        if ((i+1)%j==0) {
          n=n+1;
        }
      }
      yakusu[i]=n;
      total = total + (i+1) * yakusu[i];
    }
    System.out.println(total);
  }
}