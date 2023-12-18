import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();		//number of boxes
		int m = console.nextInt();		//number of operations
		console.nextLine();
		
		int[][] boxInfo = new int[n][2];	//of 2, first is total count, second is 0 if no red, 1 if possible
		//boxInfo[n][0] gives total balls
		//boxInfo[n][1] gives possibility of red
		
		//intialize boxes
		for(int i = 0; i < n; i++) {
			if(i == 0)
				boxInfo[0][1] = 1;
			else
				boxInfo[i][1] = 0;
			boxInfo[i][0] = 1;
		}
		
		for(int i = 0; i < m; i++) {
			int box1 = console.nextInt() - 1;	//to adjust for zero indexing
			int box2 = console.nextInt() - 1;
			console.nextLine();
			
			//if could have red ball
			if(boxInfo[box1][1] == 1) {
				//if only one ball in box, and ball is taken out, no longer possible
				if(boxInfo[box1][0] == 1) {
					boxInfo[box1][1] = 0;
				}
				boxInfo[box2][1] = 1;	//possible for box 2 to have red ball
				boxInfo[box2][0]++;		//box 2 gains a ball
				boxInfo[box1][0]--;		//box 1 loses a ball
			}
		}
		
		//loop thru and count how many 1's in pos 1 of the array in each box
		int numPossible = 0;
		for(int i = 0; i < n; i++) 
			if(boxInfo[i][1] == 1) //if possible
				numPossible++;
		
		System.out.println(numPossible);
		
	}
}