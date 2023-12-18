import java.util.*;
 
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] takoyaki = new int[n];
	for(int i = 0; i < n; i++){
	  takoyaki[i] = sc.nextInt();
    }
    
    int ans = 0;
    for(int i = 0; i < n-1; i++){
      for(int j = i+1; j < n; j++){
            ans += takoyaki[i]*takoyaki[j];
      }
    }
      	System.out.println(ans);
	
  }
}