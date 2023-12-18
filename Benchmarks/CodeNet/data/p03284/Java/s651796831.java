import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int large = n%k;
		int small = n - large;
		float possible = Math.abs((float)(small-large)/k);
		System.out.println(possible);
	}
}