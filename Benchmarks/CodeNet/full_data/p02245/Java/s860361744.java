import java.io.*;
import java.util.*;

class Main {
	// Main
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] board = new int[9];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < 9; i++) {
			if (i==3||i==6) {
				st = new StringTokenizer(br.readLine(), " ");
			}
			board[i] = Integer.parseInt(st.nextToken());
		}
		Deque<state> mainq = new ArrayDeque<state>();
		BitSet cl = new BitSet(500000);
		mainq.add(new state(board, 0));
		cl.set(hashBoard(board));
		int minStep = -1;
		while(!mainq.isEmpty()){
			final state s = mainq.remove();
			if (hashBoard(s.board) == 46233) {
				minStep = s.move;
				break;
			}
			int pos;
			for(pos = 0; pos<9 && s.board[pos] != 0; pos++);
			
			if (pos%3 != 0) {
				final int[] next = Arrays.copyOf(s.board, s.board.length);
				next[pos] = next[pos-1];
				next[pos-1] = 0;
				final int h = hashBoard(next);
				if(!cl.get(h)){
					cl.set(h);
					mainq.add(new state(next, s.move+1));
				}
			}
			
			if (pos%3 != 2) {
				final int[] next = Arrays.copyOf(s.board, s.board.length);
				next[pos] = next[pos+1];
				next[pos+1] = 0;
				final int h = hashBoard(next);
				if(!cl.get(h)){
					cl.set(h);
					mainq.add(new state(next, s.move+1));
				}
			}
			
			if (pos > 2) {
				final int[] next = Arrays.copyOf(s.board, s.board.length);
				next[pos] = next[pos - 3];
				next[pos-3] = 0;
				final int h = hashBoard(next);
				if(!cl.get(h)){
					cl.set(h);
					mainq.add(new state(next, s.move+1));
				}
			}
			
			if (pos < 6) {
				final int[] next = Arrays.copyOf(s.board, s.board.length);
				next[pos] = next[pos + 3];
				next[pos+3] = 0;
				final int h = hashBoard(next);
				if(!cl.get(h)){
					cl.set(h);
					mainq.add(new state(next, s.move+1));
				}
			}
		} //end while
	System.out.println(minStep);	
	}// End Main
	
	// Hash the game board state
	private static int hashBoard(int[] board){
		int h = board[0];
		for (int i = 1; i < 8; i++) {
			h = h*(9-i);
			h = h+board[i];
			for (int a = 0; a < i; a++) {
				if (board[a]<board[i]) {
					--h;
				}
			}
		}
		return h;
	}// End Hash Board
}





// State Class
class state{
	final int[] board;
	final int move;
	state(int[] board, int move){
		this.board = board;
		this.move = move;
	}
}
