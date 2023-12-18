import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;
		for(int i = 1; i <= n; i++){
			if((int)(Math.log10(i))%2 == 0) res++;
		}
		System.out.println(res);
	}

}
