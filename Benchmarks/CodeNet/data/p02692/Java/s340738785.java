import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static class State{
		long state[];
		char choose;
		State prev;
		public State(long a , long b , long c) {
			state = new long[3];
			state[0] = a;
			state[1] = b;
			state[2] = c;
		}
		public State(State other , char c){
			state = other.state.clone();
			choose = c;
			prev = other;
		}
		int id(){
			if(state[0] == 2){
				return 0;
			}
			if(state[1] == 2){
				return 1;
			}
			if(state[2] == 2){
				return 2;
			}
			if(state[0] == 0){
				return 3;
			}
			if(state[1] == 0){
				return 4;
			}
			return 5;
		}
	}
	static int next(long state[] , int i , int j){
		if(state[i] == 0 && state[j] == 0){
			return -1;
		}else if(state[i] >= state[j]){
			state[i]--;
			state[j]++;
			return j;
		}else{
			state[i]++;
			state[j]--;
			return i;
		}
	}
	static State[] next(State current , int i , int j, char ci , char cj){
		if(current.state[i] == 0 && current.state[j] == 0){
			return new State[0];
		}
		if(current.state[i] == 0){
			State next = new State(current, ci);
			next.state[i]++;
			next.state[j]--;
			return new State[] { next };
		}
		if(current.state[j] == 0){
			State next = new State(current, cj);
			next.state[j]++;
			next.state[i]--;
			return new State[] { next };
		}
		State next1 = new State(current, ci);
		next1.state[i]++;
		next1.state[j]--;
		State next2 = new State(current, cj);
		next2.state[j]++;
		next2.state[i]--;
		return new State[] {next1 , next2};
	}
	static void output(List<Character> path){
		System.out.println("Yes");
		for(char c : path){
			System.out.println(c);
		}
	}
	static boolean solve(long A , long B , long C , String S[]){
		long total = A + B + C;
		if(total == 2){
			// 200 , 020, 002, 011, 101, 110
			State init = new State(A, B, C);
			List<State> current = new ArrayList<State>();
			current.add(init);
			for(String s : S){
				int si = "ABC".indexOf(s.charAt(0));
				int sj = "ABC".indexOf(s.charAt(1));
				boolean vis[] = new boolean[6];
				List<State> next = new ArrayList<State>();
				for(State cur : current){
					for(State n : next(cur , si , sj , s.charAt(0) , s.charAt(1))){
						int id = n.id();
						if(vis[id]){
							continue;
						}
						next.add(n);
						vis[id] = true;
					}					
				}
				current = next;				
			}
			if(current.isEmpty()){
				return false;
			}
			List<Character> path = new ArrayList<Character>();
			State s = current.get(0);
			while(s.prev != null){	
				path.add(s.choose);
				s = s.prev;
			}
			Collections.reverse(path);
			output(path);
			return true;
		}else{
			List<Character> path = new ArrayList<Character>();
			long state[] = {A , B , C};
			for(String s : S){
				int i = next(state , "ABC".indexOf(s.charAt(0)) , "ABC".indexOf(s.charAt(1)));
				if(i == -1){
					return false;
				}else{
					path.add("ABC".charAt(i));
				}
			}
			output(path);
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				
		int N = sc.nextInt();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		String S[] = new String[N];
		for(int i = 0 ; i < N ; ++i){
			S[i] = sc.next();
		}
		if(!solve(A, B, C, S)){
			System.out.println("No");
		}
	}
}
