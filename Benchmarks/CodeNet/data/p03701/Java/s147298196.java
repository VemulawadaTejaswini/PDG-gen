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
		int mod10 = 0;
		for(int i = 0; i < n; i++){
			int num = Integer.parseInt(br.readLine());
			if(num%10==0){
				mod10+=num;
			}else{
				s.add(num);
			}

		}
		solve(s,s.size(),mod10);
	}

	static void solve(ArrayList<Integer> s, int n,int mod10){
		Queue<ArrayList<Integer>> q = new ArrayDeque<>();
		q.add(s);
		while(q.peek()!=null){
			ArrayList<Integer> num = q.poll();
			int sum = 0;
			for(int i = 0; i < n; i++){
				sum += num.get(i);
			}
			if(sum%10!=0){
				System.out.println(sum+mod10);
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