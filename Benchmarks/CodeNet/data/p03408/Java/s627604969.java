import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] s = new String[N];
		for(int i = 0; i < N; i++) s[i] = sc.next();
		int M = sc.nextInt();
		String[] t = new String[M];
		for(int i = 0; i < M; i++) t[i] = sc.next();
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for(int i = 0; i < N; i++){
			if(map.containsKey(s[i])) map.put(s[i], (map.get(s[i]).intValue()+1));
			else map.put(s[i],1);
		}		
		
		for(int i = 0; i < M; i++){
			if(map.containsKey(t[i])) map.put(t[i],map.get(t[i])-1);
		}
				
		ArrayList<Integer> coll = new ArrayList<Integer>(map.values());
		
		//for(String ss : map.keySet()) System.out.println(ss);
		//for(Integer ii : map.values()) System.out.println(ii);
		Integer ii = Collections.max(coll);
		System.out.println((ii<0)?0:ii);
		
	}
}