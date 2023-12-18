import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int N = sn.nextInt();
		int total = 0;
		int count = 0;
		for(int i = 0; i < N; ++i){
			total += i+1;
			count++;
			if(total >= N) break;
		}
		int rm = total - N;
		for(int i = 0; i < count; ++i){
			if(i+1 != rm)
				System.out.println(i+1);
		}
	}
}
