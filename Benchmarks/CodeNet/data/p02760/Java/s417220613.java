import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int[][] bingo = new int[3][3];
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        bingo[i][j] = sc.nextInt();
      }
    }
    int N = sc.nextInt();
    int[] b = new int[N];
    for(int i=0;i<N;i++){
      b[i] = sc.nextInt();
    }
    
    for(int i=0;i<3;i++){
      if(checkbingo(bingo[i][0],bingo[i][1],bingo[i][2],b,N)){
        System.out.println("yes");
        return;
      }
    }
    for(int i=0;i<3;i++){
      if(checkbingo(bingo[0][i],bingo[1][i],bingo[2][i],b,N)){
        System.out.println("yes");
        return;
      }
    }
    
    if(checkbingo(bingo[0][0],bingo[1][1],bingo[2][2],b,N)){
      System.out.println("yes");
      return;
    }
    
        if(checkbingo(bingo[0][2],bingo[1][1],bingo[2][0],b,N)){
      System.out.println("yes");
      return;
    }
    
    
    System.out.println("no");
        
    
    
  }
  
  public static boolean check(int[] b,int a,int N){
    for(int i=0;i<N;i++){
      if(b[i] == a){
        return true;
      }
    }
    return false;
  }
      
  public static boolean checkbingo(int x,int y,int z,int[] b,int N){
    if(check(b,x,N) && check(b,y,N) && check(b,z,N))
      return true;
    return false;
  } 
}