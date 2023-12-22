import java.util.*;
public class Main {
	int [][] map;
	int ans;
	String [][] boards;
	boolean isused [];

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String inputline = sc.next();
			String [] inputarray = inputline.split(",");
			int [] dis = new int[10];
			for(int i = 0; i < 10; i++){
				dis[i] = Integer.parseInt(inputarray[i]);
			}
			int [] accdis = new int[10];
			accdis[0] = dis[0];
			for(int i = 1; i < 10; i++){
				accdis[i] = accdis[i-1] + dis[i];
			}
			int v1 = Integer.parseInt(inputarray[10]);
			int v2 = Integer.parseInt(inputarray[11]);
			int sumdis = accdis[9];
			double t = (double)sumdis / (v1 + v2);
			int nowdis = (int) Math.round(v1 * t);
			int ans = -1;
			for(int i = 0; i < 10; i++){
				if(nowdis > accdis[i]){
					ans = i + 2;
				}
				else{
					break;
				}
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}