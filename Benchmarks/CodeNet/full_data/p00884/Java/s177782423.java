/*
icpc??´?????????
2010??´ ??¢?????¢ A??????
*/
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.io.*;
import java.util.LinkedHashSet;

class Main {
	public static void main(String[] args) {
		try {
			run();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	
	private static void run() throws IOException{
		int n;
		int input;
		String inst;
		String[] str;
		String boss = "boss";
		Pattern p = Pattern.compile("[:,.]+");
		
		HashSet<String> member = new HashSet<String>();
		HashSet<String> group = new HashSet<String>();
		HashMap<String,HashSet<String>> groupMap = new HashMap<String,HashSet<String>>();
		HashSet<String> inst_member;
		HashSet<String> key = new HashSet<String>();
		LinkedHashSet<String> tree = new LinkedHashSet<String>();
		HashSet<String> instant = new HashSet<String>();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			member.clear();
			group.clear();
			key.clear();
			tree.clear();
			groupMap.clear();
			n = Integer.parseInt(in.readLine()); //???????????£?????????
			if(n==0) break;
			
			for(int i=0;i<n;i++) {
				inst_member = new HashSet<String>();
				inst = in.readLine();
				
				str = p.split(inst,-1);
				
				group.add(str[0]);
				if(i==0) boss = str[0];
				
				for(int j=1;j<str.length-1;j++) {
					inst_member.add(str[j]);
				}
				groupMap.put(str[0],inst_member);
			}
			
			instant = groupMap.get(boss);
			for(String s : instant) {
				tree.add(s);
			}
			group.add(boss);
			
			String[] arr = new String[tree.size()];
			tree.toArray(arr);
			
			for(int i=0; i<arr.length; i++) {
				if(groupMap.containsKey(arr[i])) {
					instant = groupMap.get(arr[i]);
					for(String s : instant) {
						tree.add(s);
					}
					group.add(arr[i]);
				}
				if(arr.length != tree.size()) {
					arr = new String[tree.size()];
					tree.toArray(arr);
				}
			}
			
			tree.removeAll(group);
			System.out.println(""+tree.size());
		}
	}
}