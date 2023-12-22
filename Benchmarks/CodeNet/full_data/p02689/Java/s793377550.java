import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n];
        int[] a = new int[n];
        int[] count = new int[n];
      
        for(int i = 0; i < n; i++){
          h[i] = sc.nextInt();
        }
      
        int ans = 0;
        for(int i = 0; i < m; i++){
          int road1 = sc.nextInt()-1;
          int road2 = sc.nextInt()-1;
          a[road1] += 1;
          a[road2] += 1;
          if(h[road1] > h[road2]){
            count[road1] += 1;
          }else{
            count[road2] += 1;
          }
        }
      
       for(int i = 0; i < n; i++){
         if(count[i] == a[i] && count[i] != 0 && a[i] != 0){
           ans++;
         }
       }
        
       System.out.println(ans);
	}
}