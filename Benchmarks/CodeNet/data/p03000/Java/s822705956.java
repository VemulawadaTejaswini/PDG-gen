import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int ans = 0;
    int loop = 0;
    for (int i=0;i<N;i++){
      if (loop > X){
        break;
      }else{
        ans++;
      }
      loop += sc.nextInt();
    }
    System.out.println(ans);
    sc.close();
  }
}