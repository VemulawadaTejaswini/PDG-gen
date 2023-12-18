import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] a = new int[N];
    int[] ans = new int[N];
    
    for(int i = 0; i<N;i++){
    	a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    for(int i = 0; i < N;i++){
    	if(i >0 && a[i] == a[i-1]){
    		continue;
    	}
    	for(int s = 0; s < N;s++){
    		if(a[i] > a[s]){
    			a[s]++;
    			if(a[s] == a[i]){
    				ans[i]++;
    			}
    			a[s]--;
    		}else if(a[i] < a[s]){
    			a[s]--;
    			if(a[s] == a[i]){
    				ans[i]++;
    			}
    			a[s]++;
    		}else if(a[i] == a[s]){
    				ans[i]++;
    		}
    	}
    	
    }
    Arrays.sort(ans);
    System.out.println(ans[N-1]);
    
   
  }
}