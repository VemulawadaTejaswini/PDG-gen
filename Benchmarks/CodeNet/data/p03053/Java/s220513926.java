import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner keyboard = new Scanner(System.in); 
	
	int H = keyboard.nextInt();
	int W = keyboard.nextInt();
	
	String in = "";
	String S = "";
	
	for(int i = 0; i < H+1; i++) {
		if(i == 0) {
			in = keyboard.nextLine();
			S = in;
		}else {
			in = keyboard.nextLine();
			S = S + in;
		}
		
	}
	
	String[] menseki = S.split("");
	
	int count = 0;
	int turn = 0;

	while(count < H*W) {
		for(int j = 0; j < H*W; j++) {
			count = 0;
			if(menseki[j].equals(".")) { 
				continue;
			}else { 
				if(j-1 >= 0){
					if(menseki[j-1].equals(".")) {
						menseki[j-1] = "B";
					}
				}
				if(j+1 < H*W) {
					if(menseki[j+1].equals(".")) {
					menseki[j+1] = "B";
					}
				}
				if(j-W >= 0) {
					if(menseki[j-W].equals(".")) {
						menseki[j-W] = "B";
					}
				}
				if(j+W < H*W) {
					if(menseki[j+W].equals(".")) {
						menseki[j+W] = "B";	
					}
				}
			}
		}
		for(int k = 0; k < H*W; k ++) {
			if(menseki[k].equals("#")) {
				count++;
			}else if(menseki[k].equals("B")) {
				menseki[k] = "#";
				count++;
			}
		}
		turn ++;
		}
	System.out.println(turn);
	keyboard.close();
	}	
}
