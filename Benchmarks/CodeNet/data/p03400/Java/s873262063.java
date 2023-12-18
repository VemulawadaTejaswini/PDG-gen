import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int X = sc.nextInt();
    int cnt =0;
    for(int i=0; i<N; i++){
      int A = sc.nextInt();
      for(int j=0; j<100; j++){
        if (j * A + 1 <= D){
          cnt++;
        }else{
          break;
        }
      }
    }
    System.out.println(cnt);
  }
}
    
    