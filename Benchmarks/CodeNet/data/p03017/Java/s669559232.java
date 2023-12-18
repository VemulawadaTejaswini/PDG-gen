

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt() - 1;
		int b = sc.nextInt() - 1;
		int c = sc.nextInt() - 1;
		int d = sc.nextInt() - 1;

		char[] str = sc.next().toCharArray();

		if(a > c || b > d){
			System.out.println("No");
			return;
		}
		else {
//			boolean onlySkipA = true;
			boolean wallA = true;
			for(int i = a; i < c;){
				if((i == 0 || str[i - 1] == '.') && (i == n - 1 || str[i + 1] == '.')){
					wallA = false;
				}
				if(str[i + 1] == '.'){
					i++;
				}
				else if(str[i + 2] == '.'){
					i += 2;
				}
				else {
					System.out.println("No");
					return;
				}
			}

			boolean wallB = true;
			for(int i = b; i < d;){
				if((i == 0 || str[i - 1] == '.') && (i == n - 1 || str[i + 1] == '.')){
					wallB = false;
				}

				if(str[i + 1] == '.'){
					i++;
				}
				else if(str[i + 2] == '.'){
					i += 2;
				}
				else {
					System.out.println("No");
					return;
				}
			}
//
//			System.out.println(wallA + " "+wallB);
			if(a < b && c > d && wallB){
				System.out.println("No");
				return;
			}
			else if(a > b && c < d && wallA){
				System.out.println("No");
				return;
			}
			else {
				System.out.println("Yes");
				return;
			}
		}
	}
}