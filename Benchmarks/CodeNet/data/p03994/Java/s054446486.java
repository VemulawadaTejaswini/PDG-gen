import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		String s = scan.next();
		long k = scan.nextLong();
		int[] n = new int[s.length()];
		
		for(int i = 0 ; i < s.length() ; i++){
			for(int j = 0 ; j < c.length ; j++){
				
				if(s.charAt(i) == c[j]){
					n[i] = j;
					break;
				}
			}
		}
		
		for(int i = 0 ; i < n.length ; i++){
			
			if((n[i] + k) > 25){
				k = k - (26 - n[i]);
				n[i] = 0;
			}
			if(i == (n.length - 1)){
				n[i] = (n[i] + (int)(k % 26)) % 26;
				
				k = 0;
			}
			if(k == 0){
				break;
			}
			
		}
		for(int i = 0 ; i < n.length ; i++){
			System.out.print(c[n[i]]);
		}
		System.out.println();
	}
}
