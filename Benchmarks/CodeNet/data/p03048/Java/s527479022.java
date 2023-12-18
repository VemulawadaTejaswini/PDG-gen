import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int R = sc.nextInt();
    int G = sc.nextInt();
    int B = sc.nextInt();
    int N = sc.nextInt();
    int ans = 0;
    
    for(int i=0;i<3000;i++){
      for(int j=0;j<3000;j++){
        for(int k=0;k<3000;k++){
          if(i*B + j*G + k*R == N){
            ans++;
          }
        }
      }
    }
    System.out.println(ans);
  }
}
