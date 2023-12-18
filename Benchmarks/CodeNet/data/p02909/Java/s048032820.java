import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    int j,i=0;
    int [] point = new int[N];
    for(i=1;i<N+1;i++){
      point[i-1]=K;
    }
    int Q = scan.nextInt();
    for(j=0;j<Q;j++){
      int Ai = scan.nextInt();
      for(i=1;i<N+1;i++){
        if(i!=Ai){
          point[i-1]--;
        }
      }
    }
    for(i=1;i<N+1;i++){
      if(point[i-1]>0){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
  }
}