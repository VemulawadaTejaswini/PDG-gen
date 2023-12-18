import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int grid[][] = new int[3][3];
    int c[][] = new int[3][3];
    int a[] = new int[3];
    int b[] = new int[3];
    
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        grid[i][j] = sc.nextInt();
      }
    }
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        if (c[i][i] != a[i] + b[i]){
          System.out.println("No");
          break;
        }
      }
    }
    System.out.println("Yes");
  }
}