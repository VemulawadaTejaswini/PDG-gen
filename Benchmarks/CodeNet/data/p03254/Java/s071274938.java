import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        
        int[] a = new int[N];
        
        for(int i = 0;i<N;i++){
        	a[i] = sc.nextInt();
        }
        sc.close();
        
        Arrays.sort(a);
        
      int sum = 0;   
      int i = 0;

      for(i = 0;i<N;i++){
        sum += a[i];
        if(sum > x){
          break;
        }
      }
      if(i==N&&sum!=x){
        i -= 1; 
      }      
      
      System.out.println(i);

	}
}

