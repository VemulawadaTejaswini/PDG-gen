import java.util.Scanner;

public class Main {
	static String fn;
	static int id;
	static int n;
	
	static int poly() {
		int res = mono();
		if(fn.charAt(id) == '+') {
			id++;
			res += poly();
		}
		return res;
	}
	
	static int mono() {
		int res;
		int temp = 1;
		if(fn.charAt(id) == 'n' && fn.charAt(id+1) == '^') {
			id += 2;
			res = num();
			for(int i=0; i<res; i++) {
				temp *= n;
				if(temp > 1000000000)	return 100000000;
			}
			
		}
		return temp; 
	}
	
	static int num() {
		int res = 0;
		if('0' <= fn.charAt(id) && fn.charAt(id) <='9') {
			res *= 10;
			res += fn.charAt(id) - '0';
			if(id != fn.length()-1)	id++;
 		}
		return res;
		
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			int T = sc.nextInt();
			fn = sc.next();
			id = 0;
			int total = poly() * T;
			if(total < 1000000000) {
				System.out.println(total);	
			}else {
				System.out.println("TLE");	
			}
			
		}
	}
}


