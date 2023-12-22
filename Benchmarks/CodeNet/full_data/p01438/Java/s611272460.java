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
		int[] satis = new int[n];
		ArrayList<int[]> list = new ArrayList<int[]>();
		for(int i = 0; i < n; i++){
			int m = sc.nextInt();
			int s = sc.nextInt();
			satis[i] = s;
			int[] times = new int[22];
			for(int j = 0; j < m; j++){
				int start = sc.nextInt();
				int end = sc.nextInt();
				for(int k = start; k < end; k++){
					times[k] = 1;
				}
			}
			list.add(times);
		}
		
		ArrayList<Integer> person = new ArrayList<Integer>();
		ArrayList<Integer> satisfaction = new ArrayList<Integer>();
		ArrayList<int[]> schedule = new ArrayList<int[]>();
		
		person.add(-1);
		satisfaction.add(0);
		schedule.add(new int[22]);
		
		int maxSatis = 0;
		
		while(person.size() != 0){
			int nowPerson = person.get(0);
			person.remove(0);
			int nowSatisfaction = satisfaction.get(0);
			satisfaction.remove(0);
			int[] nowSchedule = schedule.get(0);
			schedule.remove(0);
			
			if(nowPerson == n-1){
				if(maxSatis < nowSatisfaction) maxSatis = nowSatisfaction;
			}
			else{
				for(int i = nowPerson + 1; i < n; i++){
					int[] newPersonSchedule = list.get(i);
					int[] newSchedule = new int[22];
					boolean ok = true;
					for(int t = 6; t < 22; t++){
						if(newPersonSchedule[t] == 1 && nowSchedule[t] == 1){
							if(maxSatis < nowSatisfaction) maxSatis = nowSatisfaction;
							ok = false;
							break;
						}
						else if(newPersonSchedule[t] == 1 || nowSchedule[t] == 1){
							newSchedule[t] = 1;
						}
					}
					if(ok){
						person.add(i);
						satisfaction.add(nowSatisfaction + satis[i]);
						schedule.add(newSchedule);
					}
				}
			}
		}
		System.out.println(maxSatis);
	}
	public static void main(String[] args){
		new Main().run();
	}
}