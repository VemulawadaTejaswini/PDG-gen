import java.util.ArrayList;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner insert = new Scanner(System.in);
		ArrayList<Integer> result = new ArrayList<Integer>();
		while(true) {
			int n = insert.nextInt();
			if(n==0) {
				break;
			}
			int count2 = 0;
			for(int i =(n+1); i <= 2 * n;i++) {
				if(i==1 || i==2) {
					count2++;
				}
				else if(i%2==1) {
					if(isSosu(i)==true) {
						count2++;
					}			
				}
			}
			result.add(count2);
			
		}
		for(int a:result) {
			System.out.println(a);
		}
	}
	public static boolean isSosu(int n){
		for(int i = 2; i <= Math.sqrt(n);i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
