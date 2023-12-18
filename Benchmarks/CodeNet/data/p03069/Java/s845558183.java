import java.util.*;

public class Main{
  public static void main(String arg[]){
    Scanner stdIn = new Scanner(System.in);
    
    int N = stdIn.nextInt();
    String S = stdIn.next();
    
    int ans = N;
    int leftBlack[N];
    int rightWhite[N];
    for(int i = 0; i < N; i++){
      leftBlack[i] = 0;
      rightWhite[i] = 0;
    }
    for(int i = 0; i < N; i++){
      if((S.charAt(i)) == "#"){
        leftBlack[i]++;
      }
      else if((S.charAt(i)) == "."){
        for(int j = i+1; j < N; j++){
          rightWhite[j]++;
        }
      }
    }
    
    for(int i = 0; i < N; i++){
    	if(ans > (leftBlack[i] + rightWhite[i])){
          ans = leftBlack[i] + rightWhite[i];
        }
    }
    
    System.out.println(ans);
  }
}