import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		
		System.out.println(getMinNumOfRepaints(S));
	}
	
	private static int getMinNumOfRepaints(String s) {
		if(s.length() == 0) return 0;
		
		char[] arr = s.toCharArray();
		int ans = Integer.MAX_VALUE;
		// if the first tile is re-painted as black
		char next = '1'; // while
		int count = arr[0] == '0'? 1 : 0;
		for(int i = 1; i < arr.length; i++){
			if(arr[i] != next) count++;
			next = next == '1'? '0':'1';
		}
		
		ans = Math.min(ans, count);
		
		// if the first tile is re-painted as white
		next = '0'; // black
		count = arr[0] == '1'? 1 : 0;
		for(int i = 1; i < arr.length; i++){
			if(arr[i] != next) count++;
			next = next == '1'? '0':'1';
		}
		
		ans = Math.min(ans, count);
		
		return ans;
	}
}
