import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] Args) throws IOException{
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final byte[] gameBoard = new byte[16];
		StringTokenizer st = null;
		for (int i = 0; i<16; i++) {
			if (i%4 == 0) {
				st = new StringTokenizer(br.readLine(), " ");
			}
			gameBoard[i] = (byte)Integer.parseInt(st.nextToken());
		}
		
		final PQ puzzleQueue = new PQ();
		final Set<Long> cl = new HashSet<Long>();
		
		puzzleQueue.add(new state(gameBoard, 0), md(gameBoard));
		int minmove = 45;
		final int dx[] = {1, 0, -1, 0};
		final int dy[] = {0, 1, 0, -1};
		
		while (!puzzleQueue.isEmpty()) {
			final state s = puzzleQueue.remove();
			final long nh = hashBoard(s.gameBoard);
			if(nh == 1401602636313L){
				minmove = s.move;
				break;
			}
			if(cl.contains(nh)) continue;
			cl.add(nh);
			int f;
			for (f = 0; f<16 && s.gameBoard[f]!=0; f++);
			for (int i = 0; i < 4; i++) {
				final int fx = f%4+dx[i];
				final int fy = f/4+dy[i];
				if(fx<0 || fx>3 || fy<0 || fy>3) continue;
				final byte[] next = Arrays.copyOf(s.gameBoard, s.gameBoard.length);
				next[f] = next[fy*4+fx];
				next[fy*4+fx] = 0;
				final long h = hashBoard(next);
				if(!cl.contains(h)){
					puzzleQueue.add(new state(next, s.move+1), s.move+1+md(next));
				}
			}
		}
		System.out.println(minmove);	
	}
	
	private static long hashBoard(byte[] b){
		long head = b[0];
		for (int i = 1; i < 15; i++) {
			head *= 16-i;
			head += b[i];
			for (int j = 0; j < i; j++) {
				if(b[j]<b[i]) --head;
			}
		}
		return head;
	}
	
	private static int md(byte[] b){
		int md = 0;
		for (int i = 0; i < 16; i++) {
			if(b[i] == 0) continue;
			final int num = b[i] - 1;
			md += Math.abs(num/4-i/4);
			md += Math.abs(num%4-i%4);
		}
		return md;
	}
	
}



class state{
	final byte[] gameBoard;
	final int move;
	state(byte[] gameBoard, int move){
		this.gameBoard = gameBoard;
		this.move = move;
	}
}

class PQ{
	int length;
	int head;
	ArrayDeque<state>[] data;
	@SuppressWarnings("unchecked")
	
	PQ(){
		length = 0;
		head = Integer.MAX_VALUE;
		data = new ArrayDeque[45];
		for(int i = 0; i<45; i++){
			data[i] = new ArrayDeque<state>();
		}
	}
	boolean isEmpty(){
		return length == 0;
	}
	boolean add(state e, int minmove){
		if(minmove>=45){
			return false;
		}
		if(minmove<head){
			head = minmove;
		}
		++length;
		return data[minmove].add(e);
	}
	state remove(){
		final state toRemove = data[head].remove();
		--length;
		for( ; head<45 && data[head].isEmpty(); ++head);
		return toRemove;
	}
}
