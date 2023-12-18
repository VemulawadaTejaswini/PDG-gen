import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner scanner =  new Scanner(System.in);
    int card[][] = new int[3][3];
    for(int i = 0;i < 3;i++){
      for(int j = 0;j < 3;j++){
        card[i][j] = scanner.nextInt();
      }
    }
    
    int figures[][] = new int[3][3];
    for(int i = 0;i < 3;i++){
      for(int j = 0;j < 3;j++){
        figures[i][j] = 0;
      }
    }
    int N = scanner.nextInt();
    for(int k = 0;k < N;k++){
      int figure = scanner.nextInt();
      for(int i = 0;i < 3;i++){
        for(int j = 0;j < 3;j++){
          if(card[i][j] == figure){
            figures[i][j] = 1;
          }
        }
      }
    }
    
    String bingo = "No";
    if(figures[0][0] == 1){
      if(figures[0][1]== 1){
        if(figures[0][2] == 1){
          bingo = "Yes";
        }
      }
      
      if(figures[1][0] == 1){
        if(figures[2][0] == 1){
          bingo = "Yes";
      	}
      }
      
      if(figures[1][1] == 1){
        if(figures[2][2] == 1){
          bingo = "Yes"; 
      	}
      }
    }
    
    if(figures[0][1] == 1){
      if(figures[1][1] == 1){
        if(figures[1][2] == 1){
          bingo = "Yes"; 
        }
      }
    }
    
    if(figures[0][2] == 1){
        if(figures[1][2] == 1){
          if(figures[2][2] == 1){
            bingo = "Yes";
        }
      }
      if(figures[1][1] == 1){
        if(figures[2][0] == 1){
          bingo = "Yes";
        }
      }
    }
    
    if(figures[2][0] == 1){
      if(figures[2][1] == 1){
        if(figures[2][2] == 1){
          bingo = "Yes";
        }
      }
    }
    
    if(figures[1][0] == 1){
      if(figures[1][1] == 1){
        if(figures[1][2] == 1){
          bingo = "Yes";
        }
      }
    }

    if(figures[2][0] == 1){
      if(figures[2][1] == 1){
        if(figures[2][2] == 1){
          bingo = "Yes";
        }
      }
    }
    
    for(int i = 0;i < 3;i++){
      for(int j = 0;j < 3;j++){
        System.out.print(card[i][j]);
      }
      System.out.println("/n");
    }
    
    for(int i = 0;i < 3;i++){
      for(int j = 0;j < 3;j++){
        System.out.print(figures[i][j]);
      }
      System.out.println("/n");
    }
    System.out.println(bingo);
  }
}