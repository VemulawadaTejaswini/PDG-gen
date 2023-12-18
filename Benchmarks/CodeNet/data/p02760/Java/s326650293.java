import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int[][] bingo = new int[3][3];
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        int[i][j] = sc.nextInt();
      }
    }
    
    int num = sc.nextInt();
    
    int[] readout = new int[num];
    for(int i = 0; i < n; i++){
      readout[i] = sc.nextInt();
    }
    int[][] punched = punch(bingo,num,readout);
    System.out.println(row(punched));
  }
  public static int[][] punch(int[][] bingo, int num, int[] readout){
    for(int i = 0; i < num; i++){
      for(int j = 0; j <3; j++){
        for(int k = 0; k < 3; k++){
          if(bingo[j][k] == readout[i]){
            bingo[j][k] = 0;
          }
        }
      }
    }
    return bingo;
  }
  public static String row(int[][] bunched){
    for(int i = 0; i < 3; i++){
      if(bunched[i][0] + bunched[i][0] + bunched [i][2] == 0){
        return "Yes"
      }
      if(bunched[0][i] + bunched [1][i] + bunched[2][i] == 0){
        return "Yes"
      }
    }
    if(bunched[0][0] + bunched[1][1] + bunched[2][2] == 0){
      return "Yes"
    }
    if(bunched[0][2] + bunched[1][1] + bunched[2][0] == 0){
      return "Yes"
    }
    return "No"
  }
}