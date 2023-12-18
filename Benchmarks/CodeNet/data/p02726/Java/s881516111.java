import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    
    int[] ans = new int[N-1];
    int min = 10000;
    for(int i =1;i<N;i++){
      for (int j = i+1;j<N+1;j++){
        min = Math.min((Math.abs(j-i)),(Math.abs(X-i)+1+Math.abs(j-Y)));
       // min = Math.min(min,Math.abs(Y-i)+1+Math.abs(j-X));
        ans[min-1]++;
      }
    }
    for(int k:ans){
      System.out.println(k);
    }
    
    
  }    
}

