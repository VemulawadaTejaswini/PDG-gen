import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int backup = N;
    int fx = 0;
    while(N>0){
      fx += N%10;
      N = N/10;
    }
    String ans = "No";
    if(backup%fx==0) ans = "Yes";
    System.out.println(ans);
  }
}