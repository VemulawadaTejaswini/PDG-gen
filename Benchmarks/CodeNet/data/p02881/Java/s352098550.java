import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = 0;
		int y = 0;
		
		for(int i=1; i<n/2+1; i++){
		    if(n%i==0){
		        x = i;
		    }
		}
		
		y = n/x;
		int ans = (x-1) + (y-1);

        System.out.println(ans);
	}
}
