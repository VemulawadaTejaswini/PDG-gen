import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		int level = 1;
		for(int i =  1 ; i <= N - 1; ++i){			
			StringBuilder sb = new StringBuilder();
			for(int j = i + 1 ; j <= N; ++j){
				if(sb.length() > 0){
					sb.append(' ');
				}
				sb.append(level);
				++cnt;
				if(cnt == N - 1){
					++level;
					cnt = 0;
				}
			}
			System.out.println(sb.toString());
		}
		
	}
}
