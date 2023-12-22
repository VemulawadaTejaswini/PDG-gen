import java.util.Scanner;

public class Main {
	
	public static int exec(int a, int b, int ops){
		return ops == 0 ? a + b : ops == 1 ? a - b : a * b; 
	}
	
	public static String print(String l, String r, int ops){
		return "(" + l + (ops == 0 ? " + " : ops == 1 ? " - " : " * ") + r +  ")";
	}
	
	public static String print(int a, int b, int ops){
		return "(" + a + (ops == 0 ? " + " : ops == 1 ? " - " : " * ") + b +  ")";
	}
	
	public static String print(String l, int b, int ops){
		return "(" + l + (ops == 0 ? " + " : ops == 1 ? " - " : " * ") + b +  ")";
	}
	
	public static String print(int a, String l, int ops){
		return "(" + a + (ops == 0 ? " + " : ops == 1 ? " - " : " * ") + l +  ")";
	}
	
	public static boolean check2(int a, int b, int c, int d, int ops1, int ops2, int ops3){
		if((exec(exec(exec(a,b,ops1),c,ops2),d,ops3)) == 10){
			System.out.println((print(print(print(a,b,ops1),c,ops2),d,ops3)));
			return true;
		}else if(exec(exec(a,exec(b,c,ops2),ops1),d,ops3) == 10){
			System.out.println(print(print(a,print(b,c,ops2),ops1),d,ops3));
			return true;
		}else if((exec(exec(a,b,ops1),exec(c,d,ops3),ops2)) == 10){
			System.out.println(print(print(a,b,ops1),print(c,d,ops3),ops2));
			return true;
		}else if((exec(exec(a,exec(b,c,ops2),ops1),d,ops3)) == 10){
			System.out.println(print(print(a,print(b,c,ops2),ops1),d,ops3));
			return true;
		}else if((exec(a,exec(b,exec(c,d,ops3),ops2),ops1)) == 10){
			System.out.println(print(a,print(b,print(c,d,ops3),ops2),ops1));
			return true;
		}
		return false;
	}
	
	public static boolean check(int a, int b, int c, int d){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 3; k++){
					if(check2(a,b,c,d,i,j,k)){
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			final int c = sc.nextInt();
			final int d = sc.nextInt();

			if (a == 0 && b == 0 && c == 0 && d ==0) {
				break;
			}
			
			int[] array = {a, b, c, d};
			
			boolean found = false;
			end:
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					for(int k = 0; k < 4; k++){
						for(int l = 0; l < 4; l++){
							if(i == j || j == k || k == l || l == i || i == k || j == l){
								continue;
							}
							
							if(check(array[i], array[j], array[k], array[l])){
								found = true;
								break end;
							}
						}
					}
				}
			}
			
			if(!found){
				System.out.println("0");
			}
		}

	}

}