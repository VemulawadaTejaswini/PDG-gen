import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 1;

		int maxMount = sc.nextInt();
		for(int i=0; i<N-1; i++){
			int currentMount = sc.nextInt();
			if(maxMount <= currentMount){
				ans++;
				maxMount = currentMount;
			}
		}

		System.out.println(ans);

	}


}
