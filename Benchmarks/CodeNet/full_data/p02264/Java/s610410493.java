import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//????????????????????????
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//?????????
		String[] arrayString = bf.readLine().split(" ");
		
		int num=Integer.parseInt(arrayString[0]);
		int q=Integer.parseInt(arrayString[1]);
		
		ArrayList<Process> que=new ArrayList<Process>();
		ArrayList<Process> finlist=new ArrayList<Process>();
		
		String list;
		while((list=bf.readLine())!=null){
			String[] str=list.split(" ");
			Process process=new Process(str[0],Integer.parseInt(str[1]));
			que.add(process);
		}
		
		int time=0;
		while(que.size()!=0){
			Process process = que.get(0);
			if(process.getTime()<=q){
				time+=process.getTime();
				process.setFinishtime(time);
				finlist.add(process);
				que.remove(0);
			}
			else{
				time+=q;
				process.reduceTime(q);
				que.add(process);
				que.remove(0);
			}
		}
		
		for(Process pro:finlist){
			System.out.println(pro.getName() + " " + pro.getFinishtime());
		}
	}
}

class Process{
	private String name;
	private int time;
	private int finishtime;
	
	public Process(String name,int time){
		this.setName(name);
		this.setTime(time);
	}

	public void reduceTime(int q) {
		this.time-=q;

		
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFinishtime() {
		return finishtime;
	}

	public void setFinishtime(int finishtime) {
		this.finishtime = finishtime;
	}
}