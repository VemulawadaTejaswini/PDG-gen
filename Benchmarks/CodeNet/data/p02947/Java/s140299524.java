
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		String[] str = new String[k];
		String[] str2 = new String[k];
 		
		for (int i = 0 ; i < k ; i ++) {
			str[i] = sc.next();
			str2[i] = "";
		}
		int count[][] = new int[k][26];
		char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
		for (int i = 0 ; i < 26 ; i ++) {
			for (int j = 0 ; j < k ; j ++) {
				
				count [j][i] = simple (str[j],abc[i]);
			}
			
		}
		long answer = 0 ;
		for (int i = 0 ; i < k-1 ; i ++) {
			
			for (int j = i+1 ; j < k ; j ++) {
				
				boolean boo_temp = true;
				for (int h = 0 ; h < 26 ; h ++) {
					
					
					if (count [i][h] != count[j] [h]) {
						
						boo_temp = false;
					}
				}
				
				if (boo_temp) {
					
					answer ++;
				}
				
			}
			
		}
		
		System.out.println(answer);
		
	}
	static int simple(String str, char target){
		int count = 0;

		for(char x: str.toCharArray()){
			if(x == target){
				count++;
			}
		}

		return count;
	}
}
