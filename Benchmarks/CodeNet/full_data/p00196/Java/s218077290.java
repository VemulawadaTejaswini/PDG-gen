import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n==0)break;
			team[] list = new team[n];
			for(int s=0;s<n;s++){
				list[s]=new team(in.next());
				for(int i=0;i<n-1;i++){
					int a = in.nextInt();
					if(a==0)list[s].win++;
					else if(a==1)list[s].lose++;
					else list[s].hiki++;
				}
			}
			Arrays.sort(list);
			for(int i=0;i<list.length;i++)System.out.println(list[i].name);
		}
	}
}
class team implements Comparable<team>{
	int win,lose,hiki;
	String name;
	team(String name){
		this.name=name;
		win=0;
		lose=0;
		hiki=0;
	}
	public int compareTo(team o) {
		if(this.win>o.win)return -1;
		else if(this.win<o.win)return 1;
		else if(this.lose<o.lose)return -1;
		else if(this.lose>o.lose)return 1;
		return 0;
	}
}