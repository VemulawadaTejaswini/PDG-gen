import java.util.*;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    //種類
    int n = sc.nextInt();
    //買う数
    int k = sc.nextInt();
    
    int[] p = new int[n];
    
    
    
    for(int i = 0; i < n;i++){
    	p[i] = sc.nextInt();
    }
    
    if(n == 1){
      System.out.println(p[0]);
      return;
    }
    
    Arrays.sort(p);
    
    int total = 0;
    for(int i = 0; i < k;i++){
      total += p[i];
    }
    
    System.out.println(total);
    
  }
}