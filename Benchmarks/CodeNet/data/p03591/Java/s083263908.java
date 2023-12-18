import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), K = sc.nextInt();
		boolean flag = false;
		for(int i = 0; i < N; i++){
			if(flag) break;
			for(int j = 0; j < M; j++){
				if(i*(M-j) + j*(N-i) == K){
					flag = true;
					System.out.println("Yes");
					break;
				}	
			}
		}
		if(!flag) System.out.println("No");
    }
}