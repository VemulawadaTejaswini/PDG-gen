import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] data = in.readLine().split(" ");
		int[] num = new int[6];
		for(int i=0; i<6; i++){
			num[i] = Integer.parseInt(data[i]);
		}
		Dices dice = new Dices(num[0],num[1],num[2],num[3],num[4],num[5]);
		String order = in.readLine();
		char[] chOrder = order.toCharArray();
		for(int j=0; j<order.length(); j++){
			if(chOrder[j]=='N'){
				dice.north();
			} else if(chOrder[j]=='E'){
				dice.east();
			} else if(chOrder[j]=='W'){
				dice.west();
			} else if(chOrder[j]=='S'){
				dice.south();
			}
		}
		System.out.println(dice.on);
	}
}

class Dices{
	public int on, tw, th, fo, fi, si;
	public Dices(int on, int tw, int th, int fo, int fi, int si){
		this.on = on;
		this.tw = tw;
		this.th = th;
		this.fo = fo;
		this.fi = fi;
		this.si = si;
	}
	void north(){
		int temp = on;
		on = tw;
		tw = si;
		si = fi;
		fi = temp;
	}
	void east(){
		int temp = on;
		on = fo;
		fo = si;
		si = th;
		th = temp;
	}
	void west(){
		int temp = on;
		on = th;
		th = si;
		si = fo;
		fo = temp;
	}
	void south(){
		int temp = on;
		on = fi;
		fi = si;
		si = tw;
		tw = temp;
	}
}