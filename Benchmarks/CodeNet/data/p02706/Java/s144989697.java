import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    int As[]=new int[M];
    int Sum=0;
    for (int i=0;i<M ;i++ ) {
      As[i]=sc.nextInt();
    }
    for (int i=0;i<M ;i++ ) {
      Sum+=As[i];
    }
    if(N-Sum>0|N-Sum==0){
      System.out.println(N-Sum);
    }else{
      System.out.println(-1);      
    }

  }
}
