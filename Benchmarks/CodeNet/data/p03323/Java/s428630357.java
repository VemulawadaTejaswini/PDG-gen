import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(b <= 8 && c <= 8){
		    System.out.println("Yay!");
		} else {
		    System.out.println(":(");
		}
	}
}
