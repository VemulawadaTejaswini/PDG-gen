import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] N = new int[5];
		for(int i = 0 ; i < 5 ; i++){
			N[i] = scanner.nextInt();
		}
		hikaku(N[0],N[1],N[2],N[3],N[4]);
		//scanner.close;

	}

	public static void hikaku(int W, int H , int x , int y , int r) {
		if((x - r) < 0){
			System.out.println("No");
		}
		else if((y - r) < 0){
			System.out.println("No");
		}
		else if((x + r) > W){
			System.out.println("No");
		}
		else if((y + r) > H){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
	}

	
}