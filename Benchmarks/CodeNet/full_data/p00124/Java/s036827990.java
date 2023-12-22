import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ1024().doIt(in.nextInt());
		while(in.hasNext()){
			int n =in.nextInt();
			if(n==0)return;
			System.out.println();
			new AOJ1024().doIt(n);
		}
	}

	class AOJ1024{
		void doIt(int n){
			if(n==0)return;
			ArrayList<Team> list = new ArrayList<Main.AOJ1024.Team>();
			for(int i=0;i<n;i++){
				list.add(new Team(in.next()));
				list.get(i).addPoint(in.nextInt()*3+in.nextInt()*0+in.nextInt());
			}
			Collections.sort(list);
			for(int i=0;i<n;i++)System.out.println(list.get(i));
		}

		class Team implements Comparable<Team>{
			String name;
			int point;
			public Team(String name){
				this.name = name;
				point = 0;
			}
			void addPoint(int p){
				this.point += p;
			}
			public int compareTo(Team o) {
				return o.point - point;
			}
			public String toString(){
				return name+","+point;
			}
		}

	}

}