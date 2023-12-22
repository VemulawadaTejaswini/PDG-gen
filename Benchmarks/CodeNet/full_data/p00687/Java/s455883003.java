import java.util.Scanner;
import java.util.*;

public class Main {
	public static void main(String[] args){
		ArrayList<Integer> T = new ArrayList<Integer>(1000001);
		Scanner in = new Scanner(System.in);
		while(true){
			int count = 0;
			int n = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			int c;
			int []S = new int [1000001];
			if(n + a + b == 0) break;
			if(a < b){
				c = a;
				a = b;
				b = c;
			}
			T.add(a);
			T.add(b);
			S[T.get(0)] = 1;S[T.get(1)] = 1;
			int cnt = 0;
			while(true){
				if(a == b) break;
				if(cnt == 0){
					T.add(T.get(T.size()-1) + b);
					if(S[T.get(T.size()-1)] == 1){
						cnt = 1;
					}
				}
				S[T.get(T.size()-1)] = 1;
				for(int i = 0;i < T.size()-1;i++){
					T.set(i,T.get(i)+a);
					if(T.get(i) > n){
						T.remove(i);
						i--;
					}
					else S[T.get(i)] = 1;
				}
				if(T.size() == 1) break;
			}
			if(a == b){
				count = n / a;
			}else{
				for(int k = 1;k <= n;k++){
					count = count + S[k];
				}
				count = n - count;
			}
			System.out.println(count);
			T.clear();
		}
	}
}