import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		int[][] dx = {{0,1,2},{0,3,6},{0,4,8},{1,4,7},{3,4,5},{6,7,8},{2,4,6},{2,5,8}};
		int fl = 0;	
		while(scan.hasNext()){
			String str = scan.nextLine().replaceAll("o","14").replaceAll("s","18").replaceAll("x","23");
			fl = 0;
			for(int i = 0;i < 8;i++){
				int t = Integer.parseInt(str.charAt(2*dx[i][0])+""+str.charAt(2*dx[i][0]+1)) 
					+ Integer.parseInt(str.charAt(2*dx[i][1])+""+str.charAt(2*dx[i][1]+1)) 
					+ Integer.parseInt(str.charAt(2*dx[i][2])+""+str.charAt(2*dx[i][2]+1));
				if(t == 42){
					fl = 1;
					break;
				}else if(t == 69){
					fl = 2;
					break;
				}
			}
			System.out.println((fl == 0)?"d":(fl == 1)?"o":"x");
		}
	}
}