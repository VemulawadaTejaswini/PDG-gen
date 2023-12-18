import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.nextLine();
    int[][] array = new int[q][2];
    int count;
    for(int i=0; i<q; i++){
      for(int j=0; j<2; j++){
        array[i][j] = sc.nextInt();
      }
    }
    for(int i=0; i<q; i++){
      count = 0;
      int x = array[i][0];
      int y = array[i][1];
      for(int j=x; j<y-x; j++){
        if(s.substring(j-1, j) == "AC"){
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
