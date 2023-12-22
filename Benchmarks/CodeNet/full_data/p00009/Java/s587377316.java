
import java.util.Scanner;
 class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,c = 0, result[] = new int[30];
		while(sc.hasNext()){
			n = sc.nextInt();
			if(n > 2) result[c]++;
			for(int i = 3; i <= n; i += 2){
				if(isPrime(i) == true){
					result[c]++;
				}
			
			}
			c++;
		}
		for(int i = 0; i < c; i++){
			System.out.println(result[i]);
		}
	}
	
	public static int isRoot(int a){
		int i = 1;
		while(a > i*i){
			i++;
		}
		return i;
	}
	
	public static boolean isPrime(int a){
		if(a == 9) return false;
		a = isRoot(a);
		for(int i = 3; i < a; i+=2){
			if(a%i == 0) return false;
		}
		return true;
	}
 }