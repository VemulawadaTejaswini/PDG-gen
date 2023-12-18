import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a[][] = new int[3][3];
    
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        a[i][j] = sc.nextInt();
      }
    }
    
    int n = sc.nextInt();
    
    int b[] = new int[n];
    
    for(int i = 0; i < n; i++){
      b[i] = sc.nextInt();
    }
    
    int count = 0;
    
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        for(int t = 0; t < n; t++){
          if(a[i][j] == b[t]){
            a[i][j] = 1;
          }else{
            a[i][j] = 0;
          }
        }
      }
    }
    
    for(int i = 0; i < 3; i++){
      if((a[i][0] == 1) && (a[i][1] == 1) && (a[i][2] == 1)){
        count++;
      }
    }
    
    for(int i = 0; i < 3; i++){
      if((a[0][i] == 1) && (a[1][i] == 1) && (a[2][i] == 1)){
        count++;
      }
    }
    
    if((a[0][0] == 1) && (a[1][1] == 1) && (a[2][2] == 1)){
      count++;
    }
    
    if((a[0][2] == 1) && (a[1][1] == 1) && (a[2][0] == 1)){
      count++;
    }
    
    if(count == 0){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
        
    sc.close();
     
  }
}
