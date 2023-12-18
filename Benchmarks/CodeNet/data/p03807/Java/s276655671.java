import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int odd = 0;
		for(int i=0; i<N; i++) {
			if(sc.nextInt()%2==1)
				odd++;
		}
		
		System.out.println(odd%2==0 ? "YES" : "NO");
		sc.close();
	}
}
