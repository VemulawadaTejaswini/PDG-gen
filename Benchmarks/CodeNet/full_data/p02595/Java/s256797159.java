import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int D = sc.nextInt();
    int ans = 0;
    for(int i=0;i<N;i++){
      int p = sc.nextInt();
      int q = sc.nextInt();
      double dist = Math.sqrt(Math.pow(p,2)+Math.pow(q,2));
      if(dist<=D) ans++;
    }
    
    System.out.print(ans);
  }
}