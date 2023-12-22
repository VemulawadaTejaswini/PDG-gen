public class Main {

	private static int[] a;
	private static int[] entranceIndex;
	private static int[] exitIndex;
	private static int[] boukaIndex;
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ???????????±??°
		int w = sc.nextInt();

		a = new int[w];
		entranceIndex = new int[w];
		exitIndex = new int[w];
		boukaIndex = new int[w];

		int entranceNum = 0;
		int exitNum = 0;
		int boukaNum = 0;

		for(int i=0; i<w; i++) {

			a[i] = sc.nextInt();
			if(a[i] == 0) {
				exitIndex[exitNum] = i;
				exitNum++;
				continue;
			}

			if(a[i] > 0) {
				entranceIndex[entranceNum] = i;
				entranceNum++;
			}else {
				boukaIndex[boukaNum] = i;
				boukaNum++;
			}
		}

		sc.close();
		
		int temp = moveCostToRightExit(entranceIndex[1]);
		System.out.println(temp);
		temp = moveCostToLeftExit(entranceIndex[1]);
		System.out.println(temp);		

	}
	
	
	public static int moveCostToRightExit(int ent) {
		
		for(int e : exitIndex) {
			
			if(e > ent) {
				return e - ent;
			}
		}
		
		return 0;
	}
	
	public static int moveCostToLeftExit(int ent) {
		
		for(int e : exitIndex) {
			
			if(e < ent) {
				return Math.abs(e - ent);
			}
		}
		
		return 0;
	}	
	
}