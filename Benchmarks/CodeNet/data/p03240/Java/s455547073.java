import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static class State{
		int Cx, Cy, H;
		public State(int Cx, int Cy, int H) {
			this.Cx = Cx;
			this.Cy = Cy;
			this.H = H;
		}
	}

    public static void main(String[] args) throws Exception {
    	try(Scanner sc = new Scanner(System.in)) {

    		int N = sc.nextInt();
    		Queue<State> q = new LinkedList<State>();
    		for(int i=0; i<101; i++) {
    			for(int j=0; j<101; j++) {
    				q.add(new State(i, j, 1000000001));
    			}
    		}

    		for(int n=0; n<N; n++) {
    			int xn = sc.nextInt();
    			int yn = sc.nextInt();
    			int hn = sc.nextInt();
    			int size = q.size();
    			for(int i=0; i<size; i++) {
    				State state = q.remove();
    				int h = hn+Math.abs(xn-state.Cx)+Math.abs(yn-state.Cy);
    				if(hn == 0)
    					h = Math.min(h, state.H);

    				if(n == 0)
    					q.add(new State(state.Cx, state.Cy, h));
    				if(n !=0 && state.H >= 1 && state.H == h)
    					q.add(new State(state.Cx, state.Cy, state.H));
    			}
    		}
    		State state = q.remove();
    		System.out.println(state.Cx+" "+state.Cy+" "+state.H);

    	}
    }
}

