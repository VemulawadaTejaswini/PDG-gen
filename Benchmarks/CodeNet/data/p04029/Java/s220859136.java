import java.util.*;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
		int numbersOf = (N - 1) / 1 + 1;
		int ans = (numbersOf + 1) * numbersOf / 2;
		System.out.println(ans);
	}
}