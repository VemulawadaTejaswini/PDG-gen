import java.util.*;
 
public class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int[][] a=new int[3][3];
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        a[i][j]=sc.nextInt();
      }
    }
    ing n=sc.nextInt();
    int[] g=new int[n];
    for(int i=0;i<n;i++){
      g[i]=sc.nextInt();
      for(int x=0;x<3;x++){
        for(int y=0;y<3;y++){
          if(g[i]==a[x][y]){
            a[x][y]=0;
          }
        }
      }
    }
    
    if((a[0][0]==a[0][1]&&a[0][1]==a[0][2])||(a[1][0]==a[1][1]&&a[1][1]==a[1][2])||(a[2][0]==a[2][1]&&a[2][1]==a[2][2])||(a[0][0]==a[1][0]&&a[1][0]==a[2][0])||(a[0][1]==a[1][1]&&a[2][1]==a[1][1])||(a[0][2]==a[1][2]&&a[1][2]==a[2][2])||(a[0][0]==a[1][1]&&a[1][1]==a[2][2])||(a[0][2]==a[1][1]&&a[1][1]==a[2][0])){
      System.out.print("Yes");
    }else{
      System.out.print("No");
    }
}