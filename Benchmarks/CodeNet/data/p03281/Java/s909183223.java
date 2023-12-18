import java.util.*;
class Main
{
  public static void main(String[] atgs)
  {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int cnt = 0;
    for(int i = 1; i <= N; i+=2){
      int tmp = 0;
      for(int j = 1; j <= i; j+=2){
        if(i % j == 0){
          tmp++;
        }
        if(tmp == 8) cnt++;
      }
      System.out.println(cnt);
    }
  }
}