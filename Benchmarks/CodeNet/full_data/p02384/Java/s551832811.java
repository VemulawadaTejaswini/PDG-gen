import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int defaultpip[] = new int[6];
		for(int i=0; i<6; i++){
			defaultpip[i] = Integer.parseInt(std.next());
		}

		Dice dc1 = new Dice(defaultpip);
		int answer = 0;

		int ques = Integer.parseInt(std.next());

		//??¬???????????¬???
		String query[] = {"S", "W", "N", "E"};

		for (int i=0; i<ques; i++){
			int top = Integer.parseInt(std.next());
			int front = Integer.parseInt(std.next());
/*
		????????????????????????

			int toppip = Arrays.asList(dc1.pips).indexOf(top);
			int frontpip = Arrays.asList(dc1.pips).indexOf(front);

			//??????
			int answerarray[][] = { {1,2,4,3},{2,0,3,5},{0,1,5,4},{0,4,5,1},{0,2,5,3},{1,3,4,2} };

			System.out.println(toppip +" "+ frontpip);
			int answer = dc1.pips[answerarray[toppip][(frontpip%4)]];
			System.out.println(answer);
		}
*/
			while(dc1.pips[dc1.nowpip] != top || dc1.pips[dc1.spip] != front){
				dc1 = dc1.newnowpips(query[(int)(Math.random()*4)]);
			}
			answer = dc1.pips[dc1.epip];
			System.out.println(answer);
		}
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

	public Dice newnowpips(String query){
		if(query.equals("N")){
			return new Dice(pips,spip,rpip,epip,wpip,nowpip,npip);
		}else if(query.equals("E")){
			return new Dice(pips,wpip,spip,nowpip,rpip,npip,epip);
		}else if(query.equals("S")){
			return new Dice(pips,npip,nowpip,epip,wpip,rpip,spip);
		}else if(query.equals("W")){
			return new Dice(pips,epip,spip,rpip,nowpip,npip,wpip);
		}else {	//clockwise
			return new Dice(pips,nowpip,epip,npip,wpip,spip,rpip);
		}
	}

	public String showdice(){
		return pips[nowpip] + " " + pips[spip] + " " + pips[epip] + " " + pips[wpip] + " " + pips[npip] + " " + pips[rpip];
	}
}