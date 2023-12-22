public class A {
	
	public static int Greatest(int[] mtnHeights){
		int currMax=mtnHeights[0];
		int maxIndex = 0;
		int mtn=0;
		while(mtn < mtnHeights.length){
			for(int mtnS = mtn + 1;mtnS < mtnHeights.length; mtnS++){
				if(mtnHeights[mtnS] > currMax){
					currMax = mtnHeights[mtnS];
					mtn = mtnS;
					maxIndex = mtnS;
				}
			}
			mtn++;
		}
		mtnHeights[maxIndex] = 0;
		
		return currMax;
	}

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		System.out.println("Input 10 mountain heights: ");
		
		int[] mtnHeights = new int[10];
		
		for(int mtn = 0; mtn < mtnHeights.length; mtn++){
			mtnHeights[mtn] = in.nextInt();
		}
		
		int first = Greatest(mtnHeights);
		int second = Greatest(mtnHeights);
		int third = Greatest(mtnHeights);
		
		System.out.print(first + " " + second + " " + third);
		
		in.close();
	}

}