import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner scanner =  new Scanner(System.in);
    int card[][] = new int[3][3];
    for(int i = 0;i < 3;i++){
      for(int j = 0;j < 3;j++){
        card[i][j] = scanner.nextInt();
      }
    }
    
    boolean appears[][] = new boolean[3][3];
    
    int N = scanner.nextInt();
    int b[] = new int[N];
    for(int i = 0;i < N;i++) b[i] = scanner.nextInt();
    
    for(int i = 0;i < 3;i++){
      for(int j = 0;j < 3;j++){
        for(int k = 0;k < N;k++){
        	if(card[i][j] == b[k]) appears[i][j] = true;
        }
      }
    }
    
    String bingo = "No";
	for(int i = 0;i < 3;i++){
      if(appears[i][0] && appears[i][1] && appears[i][2]) bingo = "Yes";
      if(appears[0][i] && appears[1][i] && appears[2][i]) bingo = "Yes";
    }
    
    if(appears[0][0] && appears[1][1] && appears[2][2]) bingo = "Yes";
    if(appears[2][0] && appears[1][1] && appears[0][2]) bingo = "Yes";
    
   
    System.out.println(bingo);
  }
}