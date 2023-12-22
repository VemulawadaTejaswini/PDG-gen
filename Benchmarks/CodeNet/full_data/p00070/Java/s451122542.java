import java.util.*;
 
public class Main {
   
    private static int[][] ans = new int[11][331];
    private static ArrayDeque<Integer> q = new ArrayDeque<Integer>();
	private static Scanner sc  = new Scanner(System.in);
	private static int n, temp;
     
  
     
         
    public static void main(String[] args) {
    	 doing(1,0);
    	 while(sc.hasNextInt()){
            n = sc.nextInt();
            temp = sc.nextInt();
            if(n < 11 && temp < 331) System.out.println(ans[n][temp]);
            else System.out.println(0);
        }
    }   
    public static void doing(int a, int b){
        if(a == 11) return;
        for(int i =  0;i < 10;i++){
            if(q.contains(i) == false){
                q.push(i);
                ans[a][b + a *i]++;
                doing(a + 1,b + a * i);
                q.pop();
            }
        }
    }
}