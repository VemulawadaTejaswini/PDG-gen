import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    
    //Declaration
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] L = new int[N];
    for(int i=0; i<N; i++) {
      L[i] = sc.nextInt();
    }
    int cnt=0;
    
    //i+j>=k is absolutely required for making Triangle;
    for(int i=0; i<N; i++) {
      for(int j=i+1; j<N; j++) {
        for(int k=j+1; k<N; k++) {
          if(i+j>=k){
            cnt++;
          }
        }
      }
    }
    System.out.println(cnt);
  }
}