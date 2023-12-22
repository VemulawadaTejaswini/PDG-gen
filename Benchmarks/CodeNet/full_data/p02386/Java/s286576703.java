import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, j, k, n;
		Boolean flag = false;
		int[] diceA = new int[6];
		int[] diceB = new int[6];
		Dice d = new Dice();
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			int[][] dice = new int[n][6];
			for(i = 0; i < n; i++) {
				for(j = 0; j < 6; j++) {
					d.dice_make(j, sc.nextInt());
					dice[i][j] = d.getDice(j);
				}
			}
			for(i = 0; i < n - 1; i++) {
				for(j = i + 1; j < n; j++) {
					for(k = 0; k < 6; k++) {
						diceA[k] = dice[i][k];
						diceB[k] = dice[j][k];
					}
					if(d.compare(diceA, diceB)) {
						flag = true;
					}
				}
			}

			if(flag) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
	}
}
class Dice{
	private int[] dice = new int[6];
	public void dice_make(int i, int dice_spot){
		dice[i] = dice_spot;
	}
	public void rotation(String direction) {
		switch(direction) {
		case "E": dice = new int[] {dice[3],dice[1],dice[0],dice[5],dice[4],dice[2]};break;
		case "N": dice = new int[] {dice[1],dice[5],dice[2],dice[3],dice[0],dice[4]};break;
		case "S": dice = new int[] {dice[4],dice[0],dice[2],dice[3],dice[5],dice[1]};break;
		case "W": dice = new int[] {dice[2],dice[1],dice[5],dice[0],dice[4],dice[3]};break;
		case "T": dice = new int[] {dice[0],dice[3],dice[1],dice[4],dice[2],dice[5]};break;
		default : dice = new int[] {};break;
		}
	}
	public void same(int a, int b) {
		int i = 0;
		for(i = 0; i < 6; i++) {
			if(i % 2 == 0) {
				rotation("E");
			}else {
				rotation("N");
			}
			if(dice[0] == a) {
				for(i = 0; i < 4; i++) {
					rotation("T");
					if(dice[1] == b) {
						return;
					}
				}
			}
		}		
	}
	public boolean compare(int[] diceA, int[] diceB) {
		int i, j, k;
		dice = diceA;
		for(i = 0; i < 6; i++) {
			for(j = 0; j < 4; j++) {
				rotation("T");
				int counter = 0;
				for(k = 0; k < 6; k++) {
					if(dice[k] == diceB[k]) {
						counter++;
					}
				}
				if(counter == 6) {
					return true;
				}
			}
			if(i % 2 == 0) {
				rotation("E");
			}else {
				rotation("N");
			}
		}
		return false;
	}
	public int getDice(int i) {
		return dice[i];
	}
	public int[] getDice_array() {
		return dice;
	}
}
