import java.util.Scanner;
public class Main {
	void find(){
		boolean cards[][] = new boolean[4][13];
		String markList[] = new String [4];
		markList[0] = "S";
		markList[1] = "H";
		markList[2] = "C";
		markList[3] = "D";
		for(int j = 0;j<4;j++){
			for(int i = 0;i<13;i++){
				cards[j][i] = false;
			}
		}
		
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt();
		for(int i = 0;i < cnt;i++){
			String mark = s.next();
			int num = s.nextInt();
			System.out.println("#" + mark);
			switch(mark){
			case "S":
				cards[0][num] = true;
				break;
			case "H":
				cards[1][num] = true;
				break;
			case "C":
				cards[2][num] = true;
				break;
			case "D":
				cards[3][num] = true;
				break;
			default:
				break;
			}
		}
		for(int j = 0;j<4;j++){
			for(int i = 0;i<13;i++){
				if(!cards[j][i]){
					System.out.println(markList[j] + " " + (i+1));
				}
			}
		}
	}
	public static void main(String args[]){
		Main m = new Main();
		m.find();
	}
}