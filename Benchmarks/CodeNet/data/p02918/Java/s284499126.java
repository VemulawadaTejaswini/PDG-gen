

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		char str[] = sc.next().toCharArray();
		char str2[] = (char[])str.clone();
		
		char target;
		char overWrite;
		
		if(str[0] == 'L'){
			target = 'R';
			overWrite = 'L';
		}
		else {
			target = 'L';
			overWrite = 'R';
		}
		
		for(int i = 1; i < n ; i++){
			if(str[i] != target){
				if(k == 0){
					break;
				}
				continue;
			}
			
			if(str[i - 1] != target){
				k--;
			}
			
			str2[i] = overWrite;
		}
		
//		System.out.println(str2);
		
		int result = 0;
		
		for(int i = 0; i < n; i++){
			if(i != 0 && str2[i - 1] == str2[i] && str2[i] == 'L'){
				result++;
			}
			
			else if (i != n - 1 && str2[i + 1] == str2[i] && str2[i] == 'R'){
				result++;
			}
		}
		
		System.out.println(result);
	}

}
