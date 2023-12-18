import java.util.HashSet;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i;
		HashSet<Integer> set = new HashSet<>();
		for(i = 0; i < n; i++)
			set.add(scan.nextInt());
		if(n == set.size())
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}