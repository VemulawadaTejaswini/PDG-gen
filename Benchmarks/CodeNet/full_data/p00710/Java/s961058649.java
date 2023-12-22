
import java.util.*;

public class Main {
	
	private static Scanner stdIn;

	public static void main(String[] args){
		stdIn = new Scanner(System.in);
		while(true){	
			int n = stdIn.nextInt();
			int r = stdIn.nextInt();
			
			if(n == 0 && r == 0)break;
			
			int[] card = new int[n];
			
			for(int i = 0;i < n; i++){
				card[i] = i+1;
			}
			
			int ans = shuffle(card,r);
			
			System.out.println(ans);
		}
	}
	
	private static int shuffle(int[] card,int r){
		stdIn = new Scanner(System.in);
		
		if(r == 0)return card[card.length - 1];
		
		int p = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		int[] a = new int[card.length];
		
		int j = 0;
		
		for(int i = 0; i < card.length-c-p+1; i++){
			a[j] = card[i];
			j++;
		}
		
		for(int i = card.length-p+1; i < card.length; i++){
			a[j] = card[i];
			j++;
		}
		
		for(int i = card.length-c-p+1; i < card.length-p+1; i++){
			a[j] = card[i];
			j++;
		}
		
		return shuffle(a,--r);
	}
	
	
	
}