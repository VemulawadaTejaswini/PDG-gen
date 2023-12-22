// ITP1_7_C

import java.util.Scanner;

class Main{
  public static void main(String[] args){
    // Configuration
    Scanner sc = new Scanner(System.in);

    // Input
    String[] row = sc.nextLine().split(" ");
    int r = Integer.parseInt(row[0]);
    int c = Integer.parseInt(row[1]);
    int[][] board = new int[r+1][c+1];
    for(int i=0; i<r; i++){
      String[] tmp = sc.nextLine().split(" ");
      for(int j=0; j<c; j++){
          board[i][j] = Integer.parseInt(tmp[j]);
      }
    }

    // Row Calculation
    for(int i=0; i<r; i++){
      int answer = 0;
      for(int j=0; j<c+1; j++){
        if(j==c){
          board[i][j] = answer;
        }else{
          answer += board[i][j];
        }
      }
    }

    // Column Calculation
    for(int j=0; j<c; j++){
      int answer = 0;
      for(int i=0; i<r+1; i++){
        if(i==r){
          board[i][j] = answer;
        }else{
          answer += board[i][j];
        }
      }
    }

    // Sum Calculation
    int sum = 0;
    for(int i=0; i<r; i++){
      sum += board[i][c];
    }
    board[r][c] = sum;

    // Output
    for(int i=0; i<r+1; i++){
      for(int j=0; j<c+1; j++){
        if(j==c){
          System.out.print(board[i][j]);
        }else{
          System.out.print(board[i][j] + " ");
        }
      }
      System.out.println();
    }
  }
}

