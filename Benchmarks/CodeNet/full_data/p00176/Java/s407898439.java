import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	Scanner scan = new Scanner(System.in);
	String str;
	int[][] sampColor = {
		{0,0,0},
		{0,0,255},
		{0,255,0},
		{0,255,255},
		{255,0,0},
		{255,0,255},
		{255,255,0},
		{255,255,255}
		};
	String[] color = new String[8];
	int[] t = new int[3];
	public void run(){
		double dis = 0;
		double s;
		int f = 0;
		color[0] = "black";
		color[1] = "blue";
		color[2] = "lime";
		color[3] = "aqua";
		color[4] = "red";
		color[5] = "fuchsia";
		color[6] = "yellow";
		color[7] = "white";
		while(scan.hasNext()){
			str = scan.next();
			if(str.equals("0")){
				return;
			}
			dis = 0;
			f = 0;
			char[] c = str.toCharArray();
			for(int i = 0;i < 3;i++){
				t[i] = 16 * change(c[2*i+1]) + change(c[2*i+2]);
			}
			for(int i = 0;i < 8;i++){
				s = calcDis(i);
				if(i == 0 || dis > s){
					f = i;
					dis = s;
				}
			}
			System.out.println(color[f]);
		}
	}
	public int change(char a){
		return (int)a - (((int)a > 96)?87:48);
	}
	public double calcDis(int num){
		int x = 0;
		for(int i = 0;i < 3;i++){
			x += (t[i] - sampColor[num][i])*(t[i] - sampColor[num][i]);
		}
		return Math.sqrt(x);
	}
}