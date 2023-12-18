import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();

    int Yukichi = 0;
    int Higuchi = 0;
    int Noguchi = 0;
    boolean flag = false;

    for(Yukichi = 0; Yukichi <= Y; Yukichi++){
      for(Higuchi = 0; Yukichi + Higuchi <= Y; Higuchi++){
        Noguchi = N - (Yukichi + Higuchi);
        int num = 10000*Yukichi + 5000*Higuchi + 1000*Noguchi;
        if(num == N)
          flag = true;
          break;
      }
    }
    if(flag)
      System.out.println(Yukichi +" "+ Higuchi +" "+ Noguchi);
    else
      System.out.println(-1 +" "+ -1 +" "+ -1);
  }
}