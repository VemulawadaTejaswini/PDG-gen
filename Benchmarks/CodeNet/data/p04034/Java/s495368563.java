public class Main {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();		//number of boxes
		int m = console.nextInt();		//number of operations
		console.nextLine();
int[] numBalls = new int[n];
		boolean[] couldHaveRed = new boolean[n];
		//intialize boxes
		for(int i = 0; i < n; i++) {
			numBalls[i] = 1;
			couldHaveRed[i] = false;
		}
		couldHaveRed[0] = true;
		
		for(int i = 0; i < m; i++) {
			int box1 = console.nextInt() - 1;	//to adjust for zero indexing
			int box2 = console.nextInt() - 1;
			console.nextLine();
			
			//if could have red ball
			if(couldHaveRed[box1]) {
				couldHaveRed[box2] = true;
				numBalls[box2]++;		//box 2 gains a ball
				numBalls[box1]--;		//box 1 loses a ball
				if(numBalls[box1] == 0)
					couldHaveRed[box1] = false;
			}
		}
		
		int numPossible = 0;
		for(int i = 0; i < n; i++)
			if(couldHaveRed[i])
				numPossible++;
		System.out.println(numPossible);
		
	}
}