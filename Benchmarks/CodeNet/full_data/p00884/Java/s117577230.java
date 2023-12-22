import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			if(n != 0){
				calc(n);
			}
			else{
				break;
			}
		}
	}
	public void calc(int n){
		HashMap<String, String[]> groups = new HashMap<String, String[]>();
		HashMap<String, Integer> members = new HashMap<String, Integer>();
		
		int count = 0;
		String first = "";
		
		for(int i = 0; i < n; i++){
			String line = sc.next();
			String lines = line.substring(0, line.length()-1);
			String[] g = lines.split(":");
			String group = g[0];
			String[] member = g[1].split(",");
			if(i == 0) first = group;
			
			groups.put(group, member);
		}
		
		ArrayList<String> list = new ArrayList<String>();
		list.add(first);
		
		while(list.size() != 0){
			String group = list.get(0);
			list.remove(0);
			String[] member = groups.get(group);
			for(int i = 0; i < member.length; i++){
				String m = member[i];
				if(groups.containsKey(m)) {
					list.add(m);
				}
				else if(!members.containsKey(m)){
					members.put(m, 1);
					count++;
				}
			}
			groups.put(group, new String[]{});
		}
		System.out.println(count);
	}
	public static void main(String[] args){
		new Main().run();
	}
}