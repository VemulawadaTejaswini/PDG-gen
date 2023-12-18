import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int N = stdIn.nextInt();
    int K = stdIn.nextInt();
    int nowNum = 1;

    for(int i = 0; i < N; i++){
      if(K >= nowNum){
        nowNum = 2 * nowNum;
        System.out.println(nowNum);
      }
      else{
        nowNum = nowNum + K;
        System.out.println(nowNum);
      }
    }

    System.out.println(nowNum);
  }

}