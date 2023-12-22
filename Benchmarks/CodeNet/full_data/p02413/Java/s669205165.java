import java.util.*;
import java.io.*;



public class Main {
    public static void main(String[] args){
      int r,c;
      Scanner sc= new Scanner(System.in);
       r=sc.nextInt();//列 4
       c=sc.nextInt();//行  5
    
      int[][] mark= new int[r+1][c+1]; 
      
      for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
             mark[i][j]=sc.nextInt();
             }
      }
      
      for(int i=0;i<r;i++){
          int sumc=0;
          for(int y=0;y<c+1;y++){
              if(y!=c){//5
                 sumc+=mark[i][y]; 
              }else{
                  mark[i][y]=sumc;
              }
             
          }
      }
      for(int i=0;i<c+1;i++){
          int sumc=0;
          for(int y=0;y<r+1;y++){
              if(y!=r){
                 sumc+=mark[y][i]; 
              }else{
                  mark[y][i]=sumc;
              }
             
          }
      }
      
    
          for(int i=0;i<r+1;i++)
          {
              for(int y=0;y<c+1;y++)
              {
                  if(y!=c)
                  {
                      System.out.printf("%d ",mark[i][y]); 
                  }
                  else{System.out.printf("%d\n",mark[i][y]);
                  }
              }
          }
      
      
      
      
    } 
     
}


