import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	private void mainrun() {
		scan = new Scanner(System.in);

		for(String s = scan.nextLine();!s.equals("0");s = scan.nextLine()){
			looprun(s);
		}
	}

	private void looprun(String s) {

		int Ans = 0;

		Set<String> history = new HashSet<String>();
		history.add(s);

		Set<String> step = new HashSet<String>();
		step.add(s);

		while(!step.isEmpty()) {
			Set<String> nstep = new HashSet<String>();

			for(String str : step) {
				String[] warm = str.split("");

				if(CheckColor(warm)) {
					System.out.println(Ans);
					return;
				}

				for(int i = 0;i < warm.length -1;i++) {
					if(!warm[i].equals(warm[i+1])) {
						String color = ChangeColor(warm[i],warm[i+1]);
						String[] cwarm = str.split("");
						cwarm[i] = cwarm[i+1] = color;

						String Cwarm = String.join("", cwarm);

						if(!history.contains(Cwarm)) {
							history.add(Cwarm);
							nstep.add(Cwarm);
						}
					}
				}
			}
			Ans++;
			step = nstep;
		}

		System.out.println("NA");
	}

	private String ChangeColor(String color1,String color2) {
		if(!color1.equals("r") && !color2.equals("r")) {
			return "r";
		}else if(!color1.equals("g") && !color2.equals("g")) {
			return "g";
		}else {
			return "b";
		}
	}

	Set<String> check = new HashSet<String>();

	private boolean CheckColor(String[] str) {
		check.clear();
		for(String S : str) { check.add(S); }
		return check.size() == 1;
	}
}
