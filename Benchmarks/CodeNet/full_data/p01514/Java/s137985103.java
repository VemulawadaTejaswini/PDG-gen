import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {	
	static class Team{
		int id;
		int slove;
		boolean flag[];
		int pena[];
		int time;
		Team(int nid,int P){
			this.id=nid;
			this.slove=0;
			this.flag=new boolean[P+1];
			this.pena=new int[P+1];
			Arrays.fill(this.flag, false);
			Arrays.fill(this.pena, 0);
			time=0;
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		//System.setOut(new PrintStream(new File("result.txt")));
		Scanner sc = new Scanner(System.in);
		int t,p=0,r,tid,pid,ttime;
		int i,j;
		String str;
		Team team[];
		while(sc.hasNext()){
			t=sc.nextInt();
			p=sc.nextInt();
			r=sc.nextInt();
			if(t+p+r==0) break;
			team=new Team[t+1];
			
			for(i=0;i<=t;i++){
				team[i]=new Team(i,p);
			}
			
			for(i=0;i<r;i++){
				tid=sc.nextInt();
				pid=sc.nextInt();
				ttime=sc.nextInt();
				str=sc.next();
				if(str.equals("CORRECT")){
					if(!(team[tid].flag[pid])){
						team[tid].slove++;
						team[tid].time+=team[tid].pena[pid]*1200+ttime;
						team[tid].flag[pid]=true;
					}
				}
				else{
					team[tid].pena[pid]++;
				}
			}//for
			int max;
			Team temp;
			temp=new Team(-1,0);
			for(i=1;i<=t;i++){
				max=i;
				for(j=i;j<=t;j++){
					if(team[max].slove<team[j].slove){
						max=j;
					}
					else if(team[max].slove==team[j].slove){
						if(team[max].time>team[j].time){
							max=j;
						}
						else if(team[max].time==team[j].time){
							if(team[max].id>team[j].id){
								max=j;
							}
						}
					}
				}//
				temp=team[i];
				team[i]=team[max];
				team[max]=temp;
			}
			for(i=1;i<=t;i++){
				System.out.println(team[i].id+" "+team[i].slove+" "+team[i].time);
			}
		}
	}
}