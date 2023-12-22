import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 
 
public class Main{
	
	public static final int SIZE = 4;
	public static final int LEN  = 8;
	
	public static boolean is_ok(int x, int y){
		if(x < 0 || y < 0 || x >= SIZE || y >= SIZE){
			return false;
		}else{
			return true;
		}
	}
	
	public static class Trie {
		int score;
		Trie[] next;
		
		private Trie(){
			this.score = -1;
			next = new Trie[26];
		}
		
		public void register_word(int deep, char[] word, int score){
			if(word.length == deep){
				this.score = score;
				return;
			}else{
				final int index = word[deep] - 'A';
				
				if(next[index] == null){
					next[index] = new Trie();
				}
				next[index].register_word(deep + 1, word, score);
			}
		}
		
		public static void register(Trie root, String word, int score){
			root.register_word(0, word.toCharArray(), score);
		}
		
		@Override
		public String toString(){
			StringBuilder sb = new StringBuilder();
			
			if(score >= 0){
				sb.append(score + " ");
			}
			
			for(int index = 0; index < 26; index++){
				if(next[index] == null){
					continue;
				}
					
				sb.append("[ " + (char)(index + 'A') + " : " + next[index].toString() + " ], ");
			}
			
			
			return sb.toString();
		}
		
		public boolean hasNext(char c){
			return next[(int)(c - 'A')] != null;
		}
		
		public boolean isWord(){
			return score >= 0;
		}
		
		public Trie getNext(char c){
			return next[(int)(c - 'A')];
		}
	}
	
	public static void dfs(final int x, final int y, int bit, char[][] inputs, Trie dict, ArrayList<Integer> times, ArrayList<Integer> scores){
		final int addr = y * SIZE + x;
		if(!is_ok(x, y)){
			return;
		}else if((bit & (1 << addr)) != 0){
			return;
		}else if(!dict.hasNext(inputs[y][x])){
			return;
		}
		
		dict = dict.getNext(inputs[y][x]);
		bit |= 1 << addr;
		
		//System.out.println(bit);
		
		if(dict.isWord()){
			times.add(Integer.bitCount(bit));
			scores.add(dict.score);
			//benefit[bit] = Math.max(benefit[bit], dict.score);
		}
		
		//System.out.println(y + " "  + x);
		
		for(int dy = -1; dy <= 1; dy++){
			for(int dx = -1; dx <= 1; dx++){
				if(dx == 0 && dy == 0){
					continue;
				}
				
				final int nx = x + dx;
				final int ny = y + dy;
				
				dfs(nx, ny, bit, inputs, dict, times, scores);
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	final int N = sc.nextInt();
    	
    	Trie dict = new Trie();
    	
    	for(int i = 0; i < N; i++){
    		final String word = sc.next();
    		final int score = sc.nextInt();
    		
    		Trie.register(dict, word, score);
    		
    		//System.out.println(word);
    		//System.out.println(dict);
    	}
    	//System.out.println(dict);
    	
    	char[][] inputs = new char[SIZE][SIZE];
    	for(int i = 0; i < SIZE; i++){
    		inputs[i] = sc.next().toCharArray();
    		//System.out.println(i);
    	}
    	
    	final int T = sc.nextInt();
    	
    	/*
    	final int MAX_BIT = 1 << (SIZE * SIZE);
    	int[] benefits = new int[MAX_BIT];
    	Arrays.fill(benefits, -1);
    	*/
    	
    	ArrayList<Integer> times  = new ArrayList<Integer>();
    	ArrayList<Integer> scores = new ArrayList<Integer>();
    	for(int y = 0; y < SIZE; y++){
    		for(int x = 0; x < SIZE; x++){
    			dfs(x, y, 0, inputs, dict, times, scores);
    		}
    	}
    	
    	//System.out.println(times + " " + scores);
    	
    	/*
    	//System.out.println(count);
    	int[] bits   = new int[count];
    	int[] scores = new int[count];
    	int cur = 0;
    	for(int bit = 0; bit < MAX_BIT; bit++){
    		if(benefits[bit] >= 0){
    			bits[cur]   = bit;
    			scores[cur] = benefits[bit];
    			cur++;
    		}
    	}
    	*/
    	//System.out.println(Arrays.toString(scores));
    	
    	int[] DP_score = new int[T + 1];
    	Arrays.fill(DP_score, -1);
    	DP_score[0] = 0;
    	
    	int max = 0;
    	for(int index = 0; index < scores.size(); index++){
    		for(int time = T; time >= 0; time--){
    			if(DP_score[time] < 0){
    				continue;
    			}
    			
    			final int next_score = DP_score[time] + scores.get(index);
    			final int next_time  = time + times.get(index);
    			
    			if(next_time > T){
    				continue;
    			}
    			
    			if(DP_score[next_time] < next_score){
    				DP_score[next_time] = next_score;
    				max = Math.max(max, DP_score[next_time]);
    			}
    		}
    	}
    	
    	
    	System.out.println(max);
    	
    	//System.out.println(Arrays.toString(benefit));
    	
    }
     
}