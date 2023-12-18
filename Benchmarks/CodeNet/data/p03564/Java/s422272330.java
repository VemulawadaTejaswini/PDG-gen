import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 1;
		boolean b = false;
		for(int i = 0; i < n; i++){
			b = result > k;
			if(b){
				result += k;
			}else{
				result *= 2;
			}

		}

		System.out.println(result);
	}
}