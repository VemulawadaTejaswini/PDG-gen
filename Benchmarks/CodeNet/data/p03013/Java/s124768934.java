import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner scan  = new Scanner(System.in);
      	int n = scan.nextInt();	
      	int M = scan.nextInt();	
      	int[] a = new int[M];
      	int ans = 0;
      	ArrayList<Integer> fibo = new ArrayList<>();
      	fibo.add(1);
      	fibo.add(1);
      	for(int i = 0; i < M; i++){
        	a[i] = scan.nextInt();
          	fibo.add(gibo.get(i) + fibo.get(i+1));
        }
      	ans = ans + fibo.get(a[0]);
      	for(int k = 0; k < M; k++){
          	if(a[k + 1] - a[k] == 1){
            	System.out.print("0");
              	break();	
            }
        	ans = ans + fibo.get(a[k + 1] - a[k]);
        }
      	if(ans < 1000000007){
        	System.out.print(ans);
        }
      	else{
        	System.out.print(ans % 1000000007);
        }
    }

}