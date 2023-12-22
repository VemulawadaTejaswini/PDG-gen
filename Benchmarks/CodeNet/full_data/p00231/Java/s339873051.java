import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Data{
	private int time,mass;
	public int getTime(){return time;}
	public int getMass(){return mass;}
	Data(){return;}
	Data(int time, int mass){this.time=time;this.mass=mass;}
}
class DataComparator implements Comparator<Data>{
	public int compare(Data d1, Data d2) {
		return d1.getTime()-d2.getTime();
	}
}
	
public class Main {
	Boolean solve(ArrayList<Data> enter,ArrayList<Data> leave,int m){
		int w=0;
		int i=0,j=0;
		while(i<enter.size()){
			if(enter.get(i).getTime()==leave.get(j).getTime()){
				w+=(enter.get(i++).getMass()-leave.get(j++).getMass());
			}
			else if(enter.get(i).getTime()<leave.get(j).getTime()){
				w+=enter.get(i++).getMass();
			}
			else if(enter.get(i).getTime()>leave.get(j).getTime()){
				w-=leave.get(j++).getMass();
			}
			if(w>m)return false;
		}
		return true;
	}
	
	void io(){
		Scanner sc=new Scanner(System.in);
		while(true){
			ArrayList<Data> enter=new ArrayList<Data>();
			ArrayList<Data> leave=new ArrayList<Data>();
			
			int n=sc.nextInt();
			if(n==0)break;
			for(int i=0;i<n;++i){
				int m=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
				enter.add(new Data(a,m));
				leave.add(new Data(b,m));

			}
			Collections.sort(enter,new DataComparator());
			Collections.sort(leave,new DataComparator());
			if(solve(enter,leave,150)){
				System.out.println("OK");
			}
			else{
				System.out.println("NG");
			}
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		new Main().io();
	}

}