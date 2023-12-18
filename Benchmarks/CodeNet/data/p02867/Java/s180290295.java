public static void main(String[] args) {
LinkedList<Integer> groupA = new LinkedList<Integer>();
LinkedList<Integer> groupB = new LinkedList<Integer>();
System.out.println("Group A is ");
groupA = generateRandomGroup(groupA);
System.out.println("Group B is ");
groupB = generateRandomGroup(groupB);

//if any one element in groupA is larger than every element in groupB, result return No
//if any one element in groupB is smaller than every element in groupA, result return No
	}

	
	public static int generateOneRandom() {
	    Random rand = new Random();
	    int num = rand.nextInt(limit);
	    return num;
	  }
	
	public static LinkedList<Integer> generateRandomGroup(LinkedList<Integer> group) {
		int temp = 1;
		for(int i = 0;i < N;i++) {
			temp = generateOneRandom();
			group.add(temp);
			System.out.print(temp +" ");
		}
		System.out.println();
		return group;
	  }