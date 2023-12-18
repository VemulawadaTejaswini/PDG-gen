import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int moveX = 0;
    int moveY = 0;
    
    for(int i=0; i<N; i++){
      for(int j=0; j<N-i; j++){
        if(N == i*j){
          moveX = i--;
          moveY = j--;
        }
      }
    }
    
    System.out.println(moveX+moveY);
  }
}
