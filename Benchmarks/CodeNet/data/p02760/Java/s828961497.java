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
      for(int j = 0; j < n; j++){
        if((a[i][0] == b[j]) && (a[i][1] ==b[j]) &&(a[i][2] ==b[j])){
          count++;
        }
      }
    }
    
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < n; j++){
        if((a[0][i] == b[j]) && (a[1][i] ==b[j]) &&(a[2][i] ==b[j])){
          count++;
        }
      }
    }
    
    for(int j = 0; j < n; j++){
     if((b[j] == a[0][0] && (b[j] == a[1][1]) && (b[j] == a[2][2]){
       count++;
      }
    
    for(int j = 0; j < n; j++){
      if((b[j] == a[0][2]) && (b[j] == a[1][1]) && (b[j] == a[2][0])){
        count++;
      }
    }
    
    if(count == 0){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
        
    sc.close();
     
  }
}
