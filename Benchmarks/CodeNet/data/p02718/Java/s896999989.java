import java.util.*;

public class ABC1612{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int x= 0;
    int N = scan.nextInt();
    int M = scan.nextInt();
    int souhyou = 0;
    int syouhin[] = new int[N];
    for(int i = 0;i<N;i++){
      syouhin[i] = scan.nextInt();
      souhyou += syouhin[i];
    }
    int zyouken = 0;
    zyouken = souhyou/(4*M)+1;

    for(int i = 0;i < N;i++){
      if(syouhin[i] >= zyouken){
        x++;
      }
    }
    if(x >= M){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
