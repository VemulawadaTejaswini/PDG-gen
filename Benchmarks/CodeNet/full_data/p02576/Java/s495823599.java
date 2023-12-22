import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int T = sc.nextInt();
    int R = (N/X+1)*T;
    if(N%X==0){
      R=(N/X)*T;
    }
    System.out.println(R);
  }
}