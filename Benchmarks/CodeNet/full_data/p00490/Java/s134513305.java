import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int cltopping[] = new int [num];
		int prdough = in.nextInt();
		int prtopping = in.nextInt();
		int cldough = in.nextInt();
		for(int i = 0; i < num;i++){
			cltopping[i] = in.nextInt();
		}
		Arrays.sort(cltopping);
		if(num == 0){
			System.out.println(cldough / prdough);
		}
		else if(num == 1){
			System.out.println( (cldough + cltopping[0]) / (prdough + prtopping));
		}
		else{
			System.out.println( (cldough + cltopping[num - 1] + cltopping[num - 2]) / (prdough + prtopping + prtopping));
		}
	
	}
}