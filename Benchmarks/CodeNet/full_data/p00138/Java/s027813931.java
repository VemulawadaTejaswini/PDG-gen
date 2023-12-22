import java.util.Arrays;
import java.util.Scanner;
 class Player implements Comparable<Player>{
	int num;
	double time;
	public Player(int num,double time){
		this.num=num;
		this.time=time;
	}
	@Override
	public String toString(){
		return num+" "+time;
	}
	@Override
	public int compareTo(Player p){
		return new Double(time).compareTo(p.time);
	}	
}

public class Main {
	static void doit(){
		Scanner scan = new Scanner(System.in);
		Player player[]=new Player[24];
		Player[] f_player=new Player[8];
		Player[] memo=new Player[6];
		for(int i=0;i<24;i++){
			player[i]=new Player(scan.nextInt(),scan.nextDouble());
		}
		//System.out.println(Arrays.toString(player));
		Arrays.sort(player,0,7);
		Arrays.sort(player,8,15);
		Arrays.sort(player,16,23);
		int k=0;
		for(int i=0;i<24;i+=8){
			f_player[k]=player[i];
			f_player[k+1]=player[i+1];
			k+=2;
		}
		int cnt=0;
		for(int i=2;i<=18;i+=8){
			memo[cnt]=player[i];
			memo[cnt+1]=player[i+1];
			cnt+=2;
		}
		Arrays.sort(memo);
		f_player[6]=memo[0];
		f_player[7]=memo[1];
		//System.out.println(Arrays.toString(memo));
		//System.out.println(Arrays.toString(f_player));
		for(int i=0;i<8;i++){
			System.out.printf("%s\n", f_player[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doit();
	}

}