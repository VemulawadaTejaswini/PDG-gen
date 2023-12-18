import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {
	static HashMap<String, Integer> map = new HashMap<String, Integer>();

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> s = new ArrayList<>();
		for(int i = 0; i < n; i++){
			s.add(Integer.parseInt(br.readLine()));
		}
		solve(s,n);
	}

	static void solve(ArrayList<Integer> s, int n){
		Queue<ArrayList<Integer>> q = new ArrayDeque<>();
		q.add(s);
		while(q.peek()!=null){
			ArrayList<Integer> num = q.poll();
			int sum = 0;
			for(int i = 0; i < n; i++){
				sum += num.get(i);
			}
			if(sum%10!=0){
				System.out.println(sum);
				return;
			}
			for(int i = 0; i < n; i++){
				if(num.get(i) != 0){
					ArrayList<Integer> next = new ArrayList<>();
					for(int j = 0; j < n; j++){
						next.add(num.get(j));
					}
					next.set(i,0);
					q.add(next);
				}
			}
		}
		System.out.println(0);
	}
}