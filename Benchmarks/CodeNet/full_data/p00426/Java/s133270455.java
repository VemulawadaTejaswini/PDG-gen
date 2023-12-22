import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");
			int n = Integer.parseInt(tmpArray[0]);
			int m = Integer.parseInt(tmpArray[1]);

			if(n == 0 && m == 0) break;

			TrayController tc = new TrayController();

			//System.out.println(n + " "+ m);
			//?????¬???????????????
			for(int i = 0; i < 3 ; i++){
				tc.setTray(new Tray(br.readLine()), i);
				//System.out.println("tray" +i+" done");
			}

			//System.out.println("initialize completed");

			System.out.println(tc.calcTimes(m));
		}
	}

}

class TrayController {
	private Tray[] trays = new Tray[3];
	private int times = -1;

	public void setTray(Tray t, int index){
		trays[index] = t;
	}

	public int calcTimes (int m){

		moveCup (this.trays, m, -1);

		if(times != -1) return m - times;
		else return -1;
	}

	private void moveCup (Tray[] trays, int m, int mode){
		//System.out.println("m = "+m+ "mode = "+mode);


		//A to B
		if(mode == 0){
			trays[1].push(trays[0].pop());
		}
		//B to C
		if(mode == 1){
			trays[2].push(trays[1].pop());
		}
		//C to B
		if(mode == 2){
			trays[1].push(trays[2].pop());
		}
		//B to A
		if(mode == 3){
			trays[0].push(trays[1].pop());
		}

		if(emptyCheck(trays)){
			//System.out.println("empty");
			if(times < m) {
				times = m;
			}
			return;
		}
		
		if(m == 0){
			/*
			System.out.println("time limeit");
			//?????¶??????top?????¨???
			for (int i = 0; i < 3; i++){
				System.out.print(trays[i].top());
			}
			System.out.println();
			*/
			return;
		}
		/*
		//?????¶??????top?????¨???
		for (int i = 0; i < 3; i++){
			System.out.print(trays[i].top());
		}
		System.out.println();
		*/

		Tray[] trayCopy = new Tray[3];
		//A to B
		if(trays[0].top() > trays[1].top()) {
			copyTray(trayCopy, trays);
			moveCup(trayCopy, m - 1, 0);
		}
		if(trays[1].top() > trays[2].top()) {
			copyTray(trayCopy, trays);
			moveCup(trayCopy, m - 1, 1);
		}
		if(trays[2].top() > trays[1].top()) {
			copyTray(trayCopy, trays);
			moveCup(trayCopy.clone(), m - 1, 2);
		}
		if(trays[1].top() > trays[0].top()) {
			copyTray(trayCopy, trays);
			moveCup(trayCopy.clone(), m - 1, 3);
		}
	}

	private void copyTray(Tray[] newTray, Tray[] origin){
		for (int i = 0 ; i < origin.length; i++){
			newTray[i] = new Tray(new ArrayList<Integer>(origin[i].getCups()));
		}
	}

	private boolean emptyCheck (Tray[] trays){
		if(trays[0].isEmpty() && trays[1].isEmpty()) {
			return true;
		}
		else if (trays[1].isEmpty() && trays[2].isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
}

class Tray {
	private ArrayList<Integer> cups = new ArrayList<Integer>();


	public Tray(String str){
		String[] tmpArray = str.split(" ");

		for(int i = 1; i < tmpArray.length; i++){
			cups.add(Integer.parseInt(tmpArray[i]));
		}

		//System.out.println("cups "+ cups.size());

	}

	public Tray(ArrayList<Integer> cups){
		this.cups = cups;
	}

	public boolean isEmpty (){
		return cups.isEmpty();
	}

	public int top() {
		if (cups.size() == 0){
			return 0;
		}
		return cups.get(cups.size() - 1);
	}

	public int pop() {
		int tmp = top();
		cups.remove(cups.size() - 1);

		return tmp;
	}

	public void push(int n) {
		cups.add(n);
	}

	public ArrayList<Integer> getCups(){
		return cups;
	}
}