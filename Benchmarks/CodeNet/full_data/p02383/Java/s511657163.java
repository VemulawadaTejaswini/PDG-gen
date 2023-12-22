import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i;
		int[] new_dice = new int[6];
		DICE d = new DICE();
		try (Scanner sc = new Scanner(System.in)) {
			for(i = 0; i < 6; i++) {
				d.Dice(i, sc.nextInt());
			}
			
			String direction = sc.next();
			for(i = 0; i < direction.length(); i++) {
				new_dice = d.rotation(direction.substring(i, i + 1));
			}
			System.out.println(new_dice[0]);
		}
	}
}
class DICE{
	private int[] dice = new int[6];
	public void Dice(int i, int dice_spot){
		dice[i] = dice_spot;
	}
	public int[] rotation(String direction) {
		switch(direction) {
		case "E": dice = new int[] {dice[3],dice[1],dice[0],dice[5],dice[4],dice[2]};break;
		case "N": dice = new int[] {dice[1],dice[5],dice[2],dice[3],dice[0],dice[4]};break;
		case "S": dice = new int[] {dice[4],dice[0],dice[2],dice[3],dice[5],dice[1]};break;
		case "W": dice = new int[] {dice[2],dice[1],dice[5],dice[0],dice[4],dice[3]};break;
		default : dice = new int[] {};break;
		}
		return dice;
	}
}

