import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int cnt1 = 0;
    int cnt2 = 0;
    inr cnt2 = 0;
    for(int i=0; i<N; i++){
      int tmp = sc.nextInt();
      if(tmp<=A){
        cnt1++;
      }else if(tmp>A && tmp<=B){
        cnt2++;
      }else if(tmp>B){
        cnt3++;
      }
    }
    System.out.println(Math.min(cnt1, Math.min(cnt2,cnt3)));
  }
}
