import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int x = sc.nextInt();
    
    int[] li = new int[n+1];
    li[0] = 0;
    
    for (int i = 1;i<=n;i++){
      li[i] = sc.nextInt();
    }

    int[] di = new int[n+1];
    di[0] = 0;

    int ans = 1; 
  
    for (int i = 1;i<=n;i++){
      di[i] = di[i-1] + li[i];
      ans = i;
    }
    if(di[ans] > x){
      ans = ans -1;
    }
    
    System.out.println(ans);
  }
}