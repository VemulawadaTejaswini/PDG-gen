import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int S = sc.nextInt();
		List<Integer> list1 = new ArrayList<>();
		int count = 0;
		for(int i = 0; i < N; i++){
			int a = sc.nextInt();
			list1.add(a);
			if(a==1){
				count =i;
			}
		}
		if( i%S+ (N-i)%S <= S-1){
			System.out.println(count/S+(N-count)/S+1);
			return;
		}else {
			System.out.println(count/S+(N-count)/S+2);
		}
	}
}