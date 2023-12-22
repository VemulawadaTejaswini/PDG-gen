package n11a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int defaultpip[] = new int[6];
		for(int i=0; i<6; i++){
			defaultpip[i] = Integer.parseInt(std.next());
		}

		Dice dc1 = new Dice(defaultpip);

		String queue = std.next();
		for(int j=0; j<queue.length(); j++){
			dc1 = dc1.newnowpips(dc1, queue.substring(j, j+1));
//			System.out.println(dc1.showdice());
		}
		System.out.println(dc1.pips[dc1.nowpip]);
	}
}

class Dice {
	int pips[];
	int nowpip;
	int spip;
	int epip;
	int wpip;
	int npip;
	int rpip;

	public Dice(int pip[]){
		this(pip, 0, 1, 2, 3, 4, 5);
	}

	public Dice(int pip[], int now, int s, int e, int w, int n, int r){
		pips = pip;
		nowpip = now;
		spip = s;
		epip = e;
		wpip = w;
		npip = n;
		rpip = r;
	}

	public Dice newnowpips(Dice d, String query){
		if(query.equals("N")){
			return new Dice(d.pips,d.spip,d.rpip,d.epip,d.wpip,d.nowpip,d.npip);
		}else if(query.equals("E")){
			return new Dice(d.pips,d.wpip,d.spip,d.nowpip,d.rpip,d.npip,d.epip);
		}else if(query.equals("S")){
			return new Dice(d.pips,d.npip,d.nowpip,d.epip,d.wpip,d.rpip,d.spip);
		}else{				// W
			return new Dice(d.pips,d.epip,d.spip,d.rpip,d.nowpip,d.npip,d.epip);
		}
	}

	public String showdice(){
		return pips[nowpip] + " " + pips[spip] + " " + pips[epip] + " " + pips[npip] + " " + pips[wpip] + " " + pips[rpip];
	}
}