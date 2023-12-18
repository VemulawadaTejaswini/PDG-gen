import java.util.Scanner;
class Main{
  public static void main(String[] args){
  	Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    int ans = 0;
    if(N == 1){
      System.out.println(M);
    }else{
      int thr = M / N;
      for(int i = 1; i <= thr; i++){
      	if(M % i == 0){
          ans = i;
        }
      }
    }
    System.out.println(ans);
  }
}