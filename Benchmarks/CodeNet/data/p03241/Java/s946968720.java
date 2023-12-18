import java.util.Scanner;
class Main{
  public static void main(String[] args){
  	Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    int ans = 1;
    if(N == 1){
      System.out.println(M);
    }else{
      int thr = M / N;
      for(int i = 2; i <= thr+1; i++){
      	if(M % i == 0){
          ans = i;
        }
      }
    }
    System.out.println(ans);
  }
}