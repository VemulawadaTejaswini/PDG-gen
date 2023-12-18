import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int d = sc.nextInt();
    int[][] x = new int[n][d];
    
    for(int i=0; i<n; i++){
      for(int j=0; j<d; j++){
        x[i][j] = sc.nextInt();
      }
    }
    
    int cnt = 0;
    for(int m=0; m<n; m++){
      for(int l=m+1; l<n; l++){
        double k = 0;
     	 for(int j = 0; j<d; j++){
      	  k += Math.pow((x[m][j]-x[l][j]), 2);
      	}
        double y = Math.sqrt(k);
        int z = (int)Math.sqrt(k);
        if(y-z == 0){
          cnt++;
        }
      }
    }
    System.out.println(cnt);
  }
}