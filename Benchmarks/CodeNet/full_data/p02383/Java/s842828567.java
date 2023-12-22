import java.io.*;

class Main{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Dice d = new Dice(br.readLine());
			d.sim(br.readLine());
			System.out.println(d.getTop());
		} catch(IOException e){
			System.out.println("Exception :" + e);
		}
	}
}
class Dice{
	private int top;
	private int forth;
	private int right;
	private int left;
	private int back;
	private int bottom;
	Dice(String label){
		String lab[] = label.split(" ", 0);
		top    = Integer.parseInt(lab[0]);
		forth  = Integer.parseInt(lab[1]);
		right  = Integer.parseInt(lab[2]);
		left   = Integer.parseInt(lab[3]);
		back   = Integer.parseInt(lab[4]);
		bottom = Integer.parseInt(lab[5]);
	}
	public void sim(String order){
		int work;
		for(int i=0; i<order.length(); i++){
			switch(order.charAt(i)){
			case 'N':
				work   = top;
				top    = forth;
				forth  = bottom;
				bottom = back;
				back   = work;
				break;
			case 'E':
				work   = top;
				top    = left;
				left   = bottom;
				bottom = right;
				right  = work;
				break;
			case 'W':
				work   = top;
				top    = right;
				right  = bottom;
				bottom = left;
				left   = work;
				break;
			case 'S':
				work   = top;
				top    = back;
				back   = bottom;
				bottom = forth;
				forth  = work;
				break;
			}
		}
	}
	public int getTop(){
		return top;
	}
}