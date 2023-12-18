import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		String ans = "N0";
		Set<Long> set = new HashSet<>();
		for(long i = 0;i < N;i++){
			set.add(sc.nextLong());
		}
		if(N == set.size()){
			ans = "Yes";
		}
		System.out.println(ans);
	}
}