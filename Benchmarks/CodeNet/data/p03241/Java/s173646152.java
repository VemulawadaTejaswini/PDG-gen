import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int answer = 1;
		for(int i=N; i<M; i++){
			if(M%i==0){
				answer = M/i;
				break;
			}
		}
		System.out.println(answer);
		return;
	}
}