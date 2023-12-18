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
		int max=0, max2=0, max3=0;
		int p1 = 0, p2=0, p3=0;
		
		for(int i=0; i<26; i++){
			if(num[i] > max){
				max3 = max2;
				max2 = max;
				max = num[i];
				p3 = p2;
				p2 = p1;
				p1 = i;
			}else if(num[i] > max2){
				max3 = max2;
				max2 = num[i];
				p3 = p2;
				p2 = i;
			}else if(num[i] > max3){
				max3 = num[i];
				p3 = i;
			}
		}
		
		if(max + max2 == n){
			System.out.println("Second");
			return;
		}
		
		if(max + max2 + 1 == n){
			if(p3 == 0 || p3 == n-1){
				System.out.println("First");
			}else if(c[p3-1] == c[p3+1]){
				System.out.println("Second");
			}else{
				System.out.println("First");
			}
			return;
		}
		
		
		if(n % 2 == 0){
			System.out.println("Second");
		}else{
			System.out.println("First");
		}
		
		/*if(n % 2 == 0){
			if(c[0] == c[n-1]){
				System.out.println("Second");
			}else{
				System.out.println("Second");
			}
		}else{
			if(c[0] == c[n-1]){
				System.out.println("Second");
			}else{
				System.out.println("Second");
			}
		}*/
		
		/*for(int i=0; i<n-1; i++){
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
		
		if(c[0] == c[n-1]){
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
