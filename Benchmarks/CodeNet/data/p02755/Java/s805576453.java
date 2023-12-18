import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int result = -1;

		for(int i=1; i<=1250; i++){
			if(Math.floor(i*0.08)==a && Math.floor(i*0.1)==b){
				result = i;
				break;
			}
		}
		System.out.println(result);

	}
}
