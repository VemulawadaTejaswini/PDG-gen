import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0147().doIt();
	}
	
	class AOJ0147{
		int[] waitTime;
		State[] states;
		void doIt(){
			waitTime = new int[100];
			LinkedList<WaitState> q = new LinkedList<WaitState>();
			states = new State[17];
			for(int i=0;i<17;i++)states[i] = new State(-1, -1);
			for(int i=0;i<100*5;i++){
				removeState(i);
				if(i%5==0)q.add(new WaitState(i/5, (i/5)%5==1? 5:2, i));//stack
				int index = -1;
				if(q.size()>0)index = canPush(q.get(0));
				while(index >= 0){
					waitTime[q.get(0).ban] = i-q.get(0).startTime;
					setState(q.remove(), index, i);
					if(q.size()==0)break;
					index = canPush(q.get(0));
//					System.out.println(q.get(0).ban+" "+q.get(0).num+" "+q.get(0).startTime+" "+index);
				}
//				printState(i);
//				System.out.println("stacks are ");
//				for(int s=0;s<q.size();s++)System.out.println(q.get(s).ban+" "+q.get(s).num);
//				System.out.println("--------------");

			}
			while(in.hasNext())System.out.println(getResult(in.nextInt()));
		}
		
		void printState(int time){
			for(int i=0;i<17;i++){
				System.out.println((time)+":"+states[i].ban+" _ "+states[i].endTime);
			}
		}
		
		void removeState(int time){
			for(int i=0;i<17;i++)if(states[i].ban>=0&&states[i].endTime<=time)
				states[i] = new State(-1, -1);
		}
		
		void setState(WaitState j,int index,int currentTime){
			int endTime = 17*(j.ban%2)+3*(j.ban%3)+19; 
			for(int i=index;i<index+j.num;i++){
				states[i] = new State(j.ban, endTime+currentTime);
			}
		}
		
		int canPush(WaitState j){
			for(int i=0;i<17-j.num;i++)if(states[i].ban == -1){
				int cnt = 0;
				for(int s=i;s<i+j.num;s++)if(states[s].ban == -1)cnt++;
				if(cnt==j.num)return i;
			}
			return -1;
		}
		
		int getResult(int n){
			return waitTime[n];
		}
		
		class WaitState{
			int ban,num,startTime;
			public WaitState(int _ban,int _num,int _startTime) {
				ban = _ban;
				num = _num;
				startTime = _startTime;
			}
		}
		
		class State{
			int ban,endTime;
			public State(int _ban,int _endTime){
				ban = _ban;
				endTime = _endTime;
			}
		}
		
	}
	
}