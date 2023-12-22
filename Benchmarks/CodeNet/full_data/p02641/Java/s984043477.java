import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
      	int x = sc.nextInt();
        int n = sc.nextInt();
      	int ps[] = new int[n];
      	int ans;
      	int istack;
      
      	for(int i = 0;i < n;i++){
          istack = sc.nextInt();
          if(istack <= 0) ps[i] = Math.abs(x-istack)*2;
          else ps[i] = Math.abs(x-istack)*2+1;
        }
      
      	Arrays.sort(ps);
      	ans = 1;
      	while(ps[ans-1] == ans) ans++;
        
      	if(ans%2 == 0) x -= ans/2;
      	else x += ans/2;
            
      	System.out.println(x);
      
	}
}