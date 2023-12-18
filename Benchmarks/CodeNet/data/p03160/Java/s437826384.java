import java.util.*;
 
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h = new int[n];
    
    for(int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }
    
    int totalCost = 0, i = n-1;
    while(i > 1) {
      int cost1 = Math.abs(h[i] - h[i-1]);
      int cost2 = Math.abs(h[i] - h[i-2]);
      
      if(cost1 < cost2){
        totalCost += cost1;
        i--;
      } else {
        totalCost += cost2;
        i -= 2;
      }
    }
    
    if(i == 1)
      totalCost += Math.abs(h[1] - h[0]);
    
    System.out.println(totalCost);
  }
}