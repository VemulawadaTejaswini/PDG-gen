import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean rate[] = new boolean[8];
    int istack;
    int count = 0;
    int free = 0;
    
    Arrays.fill(rate,false);
    
    for(int i = 0;i < n;i++){
    	istack = sc.nextInt();
      	istack /= 400;
      	if(istack > 7) free++;
      	else rate[istack] = true;
    }
    
    for(int i = 0;i < 8; i++){
    	if(rate[i]) count++;
    }
    
    if(count == 0){
    	count = 1;
      	free--;
    }
    
    System.out.println(count + " " + (count+free));
  }
}
