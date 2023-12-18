import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int ans = 0;
    if(X<2*Y&&Y<2*X&&(X+Y)%3==0){
      int sa = Math.abs(X-Y); //差の絶対値
      int sum = (X+Y)/3;
      int larger = (sum-sa)/2+sa;
      int smaller = (sum-sa)/2-sa;
      int answer = kaijou(sum)/(kaijou(larger)*kaijou(smaller));
      ans = answer%1000000007;
    }
    System.out.println(ans);
  }
  public static int kaijou(int input){
    int R=1;
    for(int i = 2;i<=input;i++){
      R=R*i;
    }
    return R;
  }
}