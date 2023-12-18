import java.util.*;
public class Main {
	public static void main(String[] args) {	
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int [] a = new int[n];
		
		for(int i = 0; i < a.length; i++){
			a[i] = stdIn.nextInt();
		}
		
		int max = 0;
		for(int i = 0; i < a.length; i++){
			int cnt = 0;
			if(i==a.length-1){
				break;
			}
			
		for(int j = a[i]; a[i] > a[i+1]; j++){
			cnt++;
				
		}
		if(max < cnt){
			max = cnt;
		}
			
		}
		System.out.println(max);
		
	}
		
}
