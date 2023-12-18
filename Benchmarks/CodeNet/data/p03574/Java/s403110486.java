import java.util.*;

public class Main {            
  
  static int H;
  static int W;
  static int dx[] = new int[]{-1,-1,-1,0,1,1,1,0};    
  static int dy[] = new int[]{-1,0,1,1,1,0,-1,-1};    
  
  public static void main(String[] args) {                                
    
    Scanner sc = new Scanner(System.in);      
    
    H = sc.nextInt();
    W = sc.nextInt();
        
    char start[][] = new char[H][W];
   
    for(int i = 0;i < H;i++){
        String S = sc.next();
        for(int j = 0;j < W;j++){
                start[i][j] = S.charAt(j);
        }
    }
    
    for(int i = 0;i < H;i++){
        for(int j = 0;j < W;j++){
            if(start[i][j] == '.'){
               start[i][j] = check(start,i,j); 
            }            
        }
    }
    
    for(int i = 0;i < H;i++){
        for(int j = 0;j < W;j++){
            System.out.print(start[i][j]);
        }
        System.out.println();
    }
  }    
  
  public static char check(char a[][],int i,int j){
      int count = 0;
      for(int k = 0;k < 8;k++){
          if(i + dy[k] < 0 || i + dy[k] >= H || j + dx[k] <0 || j + dx[k] >=W){
              continue;
          }          
         char ny = a[i + dy[k]][j + dx[k]];
         if(ny == '#'){
             count++;
         }
      }      
      return String.valueOf(count).charAt(0);
  }
  
}
        
