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
        if(i<=x && j>=y){
          a[j-i-(y-x)]++;
        }
        else{
          a[j-i-1]++;
        }
      }
    }
    for(int i=0; i<n; i++){
      System.out.println(a[i]);
    }
  }
}