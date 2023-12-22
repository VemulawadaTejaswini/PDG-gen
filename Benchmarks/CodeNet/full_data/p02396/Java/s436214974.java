import java.util.Scanner;
class Main {
	int x,y,i;
	private int [] su = new int[999];
	public void suzuki(){
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		for(y = 0;x != 0;y++){
			su[y] = x;
			x = sc.nextInt();
		}
		for(i = 1;i <= y;i++){
			System.out.println("Case" + i + ":" + " " + su[i - 1]);
		}
	}
	public static void main(String[] args){
		new Main().suzuki();
	}
}