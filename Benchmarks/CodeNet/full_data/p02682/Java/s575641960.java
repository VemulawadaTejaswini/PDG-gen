import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    
    int A = stdIn.nextInt();
    int B = stdIn.nextInt();
    int C = stdIn.nextInt();
    int K = stdIn.nextInt();
    
    int maxscore = 0;
    do{
      maxscore++;
      A--;
      K--;
    }while(A > 0 && K > 0);
    
    if(K > 0){
      do{
        B--;
        K--;
      }while(B > 0 && K > 0);
    }
    
    if(K > 0){
      do{
        maxscore--;
        C--;
        K--;
      }while(C > 0 && K > 0);
    }
    
    System.out.println(maxscore);
      
  }
}