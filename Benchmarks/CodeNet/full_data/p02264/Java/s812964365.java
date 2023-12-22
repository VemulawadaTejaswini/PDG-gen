import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int sTime = scan.nextInt();
			Process[] schedule = new Process[n];
			int count = n;
			int j = 0;
			int sumTime = 0;
			for(int i = 0;i < n;i++){
				schedule[i] = new Process(scan.next(),scan.nextInt());
				if(schedule[i].getTime() <= sTime){
					sumTime += schedule[i].getTime();
					System.out.println(schedule[i].getName() + " " + sumTime);
					schedule[i].setTime(0);
					count--;
				}else{
					sumTime += sTime;
					schedule[i].minusTime(sTime);
				}
			}
			while(count > 0){
				if(j >= n){
					j %= n;
				}
				if(schedule[j].getTime() == 0){
					j++;
					continue;
				}else if(schedule[j].getTime() <= sTime){
					sumTime += schedule[j].getTime();
					System.out.println(schedule[j].getName() + " " + sumTime);
					schedule[j].setTime(0);
					j++;
					count--;
					continue;
				}
				sumTime += sTime;
				schedule[j].minusTime(sTime);
				j++;
			}
		}
	}
	class Process{
		String name;
		int time;
		public Process(){
		}
		public Process(String name,int time){
			this.name = name;
			this.time = time;
		}
		public int getTime(){
			return this.time;
		}
		public void setTime(int time){
			this.time = time;
		}
		public String getName(){
			return this.name;
		}
		public void minusTime(int time){
			this.time -= time;
		}
	}
}