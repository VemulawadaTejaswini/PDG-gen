import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		sc.close();
		String ans[] = {"Yay!", ":("};
		int an = 0;
		if(Math.max(a, b) > 8)an = 1;
		System.out.println(ans[an]);
	}

}
