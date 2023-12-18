import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
		int P = 1;
		for(int i=1;i<=N;i++){
			P = P*i;
		}
		System.out.println(P%(10^9 + 7));
	}

}