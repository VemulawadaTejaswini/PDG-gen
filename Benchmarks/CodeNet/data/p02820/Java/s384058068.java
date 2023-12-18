import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();//[1]
		hm.put('s', sc.nextInt());
		hm.put('p', sc.nextInt());
		hm.put('r', sc.nextInt());
		
		String T = sc.next();
		int score = 0;
		boolean[] flag = new boolean[K];
		Arrays.fill(flag, false);
		for(int i = 0; i < N; i++){
			char x = T.charAt(i);			
			if(i < K){
				score += hm.get(x);
			}
			else{
				if(T.charAt(i - K) != x || flag[i % K]){
					score += hm.get(x);
					flag[i % K] = false;
					
				}
				else
					flag[i % K] = true;
			}
		}
		System.out.println(score);
	}
}