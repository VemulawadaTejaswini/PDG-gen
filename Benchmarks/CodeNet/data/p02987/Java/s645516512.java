import java.util.*;
public class Beginner132A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		char c [] =x.toCharArray();
		Arrays.parallelSort(c);
		if(c[0]== c[1] && c[2] == c[3] && c[2]!=c[1])
			System.out.println("Yes");
		else 
			System.out.println("No");

	}

}
