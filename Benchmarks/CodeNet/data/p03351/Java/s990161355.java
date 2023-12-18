import java.util.Scanner;

public class Aa{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pA;
    int pB;
    int pC;
    int pD;
    int ans;
    int ans2;


    pA = sc.nextInt();
    pB = sc.nextInt();
    pC = sc.nextInt();
    //許容距離
    pD = sc.nextInt();

    ans = pA - pC;
    ans2 = pC - pA;

    for(;;){
      //AさんとCさんが直接更新可能な場合
      if(ans <= pD && ans >= 0){
        System.out.println("Yes");
        break;
      }else if(ans2 <= pD && ans2 >= 0){
        System.out.println("Yes");
        break;
      }

      ans = pA - pB;
      if(ans < 0){
        ans = pB - pA;
      }

      ans2 = pC - pB;
      if(ans2 < 0){
        ans2 = pB - pC;
      }

      if(ans <= pD && ans2 <= pD){
        System.out.println("Yes");
        break;
      }

      System.out.println("No");
      break;
    }
  }
}