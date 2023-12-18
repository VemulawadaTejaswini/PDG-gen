import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int n = s.length();
		char[] c = s.toCharArray();
		
		int[] num = new int[26];
		for(int i=0; i<n; i++){
			num[c[i] - 'a']++;
		}
		int max=0, max2=0;
		
		for(int i=0; i<26; i++){
			if(num[i] > max){
				max2 = max;
				max = num[i];
			}else if(num[i] > max2){
				max2 = num[i];
			}
		}
		
		for(int i=0; i<n-1; i++){
			if(c[i] == c[i+1]){
				System.out.println("Second");
				return;
			}
		}
		
		int rem = n - max - max2;
		
		if(rem%2 == 0){
			System.out.println("Second");
		}else{
			System.out.println("First");
		}
		
		/*if(c[0] == c[n-1]){
			if(rem%2 == 0){
				System.out.println("Second");
			}else{
				System.out.println("First");
			}
		}else{
			if(rem%2 == 0){
				System.out.println("Second");
			}else{
				System.out.println("Second");
			}
		}*/
	}

}