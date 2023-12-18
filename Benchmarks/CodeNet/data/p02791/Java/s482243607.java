import java.util.*;
public class Main {
  
  public static int p[];
  
  private static boolean judge(int i){
    for(int j = 1; j <= i; j++){
      if(p[i-1] > p[j-1]){
        return false;
      }
    }
    return true;
    //System.out.println();
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    p = new int[n];
    for(int i = 0; i < n; i++){
      p[i] = sc.nextInt();
    }
    
    int count = n;
    
    for(int i = 1; i <= n; i++){
      if(!judge(i)){
        count--;
      }
    }
    System.out.println(count);
  }
}