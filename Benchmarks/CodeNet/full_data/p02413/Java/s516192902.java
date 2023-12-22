import java.util.Scanner;
  
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int a[][] = new int[r+1][c+1];

  	for(int x = 0; x <= r; x++){
  	  for(int y = 0; y <= c; y++){
  	  	a[x][y] = 0;
  	  }
    }
    for(int x = 0; x < r; x++){
      for(int y = 0; y < c; y++){
        a[x][y] = sc.nextInt();
        a[x][c] = a[x][c]+a[x][y];
        a[r][y] = a[r][y]+a[x][y];
      	a[r][c] = a[x][y]+a[r][c];
      }
    }
  
    for(int x = 0; x <= r; x++){
      for(int y = 0; y <= c; y++){
        if(y == c){
          System.out.print(a[x][y]);
        }else{
          System.out.print(a[x][y]+" ");
        }
      }
      System.out.println("");
    }
  }
}
