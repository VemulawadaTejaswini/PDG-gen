import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt()-1;
    int X = sc.nextInt()-1;
    int Y = sc.nextInt()-1;
    int x = Math.min(X, Y);
    int y = Math.max(X, Y);
    int[] a = new int[n];
    
    for(int i=0; i<n+1; i++){
      for(int j=i+1; j<n+1; j++){
        int normal = j-i;
        int warp = Math.abs(j-y)+1+Math.abs(i-x);
        if(normal<warp){
          a[normal-1]++;
        }
        else{
          a[warp-1]++;
        }
      }
    }
    for(int i=0; i<n; i++){
      System.out.println(a[i]);
    }
  }
}