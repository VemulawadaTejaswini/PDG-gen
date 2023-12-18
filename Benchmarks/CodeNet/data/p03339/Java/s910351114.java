import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char s[]=sc.next().toCharArray();

		int score=0;
		int best=0;
		for(int i=1;i<N;i++){
			if(s[i]=='E')score++;
		}
		best=score;
		
		for(int i=1;i<N;i++){
			if(s[i-1]=='W')score++;
			if(s[i]=='E')score--;
			if(best>score) best=score;
		}

		System.out.println(best);
	}

	public static int gcd(int a, int b) {
		return a%b==0 ? b : gcd(b,a%b);
	}
}
