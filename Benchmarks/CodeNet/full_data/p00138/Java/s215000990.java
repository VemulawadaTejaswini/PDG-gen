import java.util.Arrays;
import java.util.Scanner;
class Player implements Comparable<Player>{
	int no;
	double time;
	Player(int n,double t){
		no=n;
		time=t;
	}
	@Override
	public int compareTo(Player a) {
		// TODO 自動生成されたメソッド・スタブ
		if(this.time<a.time){
			return -1;
		}
		else if(this.time>a.time){
			return 1;
		}
		else{
			return 0;
		}
	}
}
public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		Player p[][]=new Player[3][8];
		Player all[]=new Player[24];
		for(int i=0;i<3;i++){
			for(int j=0;j<8;j++){
				p[i][j]=new Player(sc.nextInt(),sc.nextDouble());
			}
		}
		Arrays.sort(p[0]);Arrays.sort(p[1]);Arrays.sort(p[2]);
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				System.out.printf("%d %.2f\n",p[i][j].no,p[i][j].time);
				p[i][j].time=1<<20;
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<8;j++){
				all[8*i+j]=new Player(p[i][j].no,p[i][j].time);
			}
		}
		Arrays.sort(all);
		for(int i=0;i<2;i++) System.out.printf("%d %.2f\n",all[i].no,all[i].time);
	}
}