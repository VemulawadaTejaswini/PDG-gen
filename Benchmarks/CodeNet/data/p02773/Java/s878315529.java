

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static PrintWriter p = new PrintWriter(System.out, true);

	public static void main(String[] args) throws Exception {
		
		try {
			int n = Integer.parseInt(sc.nextLine());
			Map<String, Integer> map = new HashMap<>();
			int ma = Integer.MIN_VALUE;
			for(int i=0;i<n;i++)
			{
				String s = sc.nextLine();
				map.put(s, map.getOrDefault(s, 0)+1);
				ma = Math.max(ma,map.get(s));
			}
			TreeMap<String, Integer> sorted = new TreeMap<>(); 
			sorted.putAll(map); 
			for(Map.Entry<String, Integer> m:sorted.entrySet()) {
				if(ma==m.getValue()) {
					System.out.println(m.getKey());
				}
			}
						
		}catch(Exception i) {}
	}

	private static StringBuilder reverse(StringBuilder sb) {
		// TODO Auto-generated method stub
		return null;
	}
}