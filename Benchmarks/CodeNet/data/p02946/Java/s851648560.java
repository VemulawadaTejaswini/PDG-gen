import java.util.*;
class Main{
  public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int K = stdIn.nextInt();
    int X = stdIn.nextInt();
    for(int i=X-K;i<X+K+1;i++){
      System.out.print(i);
    }
  }
}