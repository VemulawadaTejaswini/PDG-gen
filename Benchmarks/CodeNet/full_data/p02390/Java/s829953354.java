import java.util.*;

class Main{
	public static void main(String[] args){
		int time;
		int h;
		int min;
		int s;
		
		Scanner cin = new Scanner(System.in);
		time=cin.nextInt();
		
		h=time/3600;
		min=(time-h*3600)/60;
		s=time-h*3600-min*60;
		System.out.println(h+":"+min+":"+s);
	}
}
