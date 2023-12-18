import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int max = scan.nextInt();
		int a; 
		int count = 0;
		for(int i = 0; i < max; i++){
			a = scan.nextInt();

			count += get2(a);
		}

		System.out.println(count);

	}

	private static int get2(int a){
		int count = 0;
		
		while(true){
			if(a % 2 != 0){
				return count;
			}

			a /= 2;
			count++;
		}
	}
}
