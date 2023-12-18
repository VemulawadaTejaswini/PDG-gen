import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long X = sc.nextLong();

    long[] layer = new long[N + 1];
    long[] paty = new long[N + 1];
    layer[0] = 1;
    paty[0] = 1;
    for(int i = 1; i <= N; i++){
      layer[i] = 2 * layer[i - 1] + 3;
      paty[i] = 2 * paty[i - 1] + 1;
    }

    long ans = 0;
    int i = N;
    while(i >= 1){
      if(X == 2 * layer[i - 1] + 3){
        ans += 2 * paty[i - 1] + 1;
        break;
      }else if(X > layer[i - 1] + 2){
        ans += paty[i - 1] + 1;
        X -= layer[i - 1] + 2;
        i--;
      }else if(X == layer[i - 1] + 2){
        ans += paty[i - 1] + 1;
        break;
      }else if(X == layer[i - 1] + 1){
        ans += paty[i - 1] + 1;
        break;
      }else{
        X--;
        i--;
      }
    }

    if(i == 0 && X == 1){ans++;}

    System.out.println(ans);
    sc.close();
  }
}
