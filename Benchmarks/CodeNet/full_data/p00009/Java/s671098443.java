import java.util.Scanner;

public class Main {

	static final Integer N = 1000010;
	static Boolean[] prime = new Boolean[N];

	public static void makePrime(){
		for(int i = 0; i < N; i++) prime[i] = true;
		prime[0] = false;
		prime[1] = false;
		for(int i = 0; i * i <= N; i++){
			if(!prime[i]) continue;
			for(int j = i + i; j < N; j += i) prime[j] = false;
		}
	}

	public static void main(String[] args) {
		makePrime();
		Scanner s = new Scanner(System.in);
		while(s.hasNextInt()){
			int n = s.nextInt();
			int cnt = 0;
			for(int i = 0; i <= n; i++) if(prime[i]) cnt++;
			System.out.println(cnt);
		}
		s.close();
	}
}