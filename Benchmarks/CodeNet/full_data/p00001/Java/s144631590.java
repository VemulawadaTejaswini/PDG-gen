class listOfTop3Hills {
	public static void main(String[] args) {
		int highest = 0;
		int higher = 0;
		int high = 0;
		for (String arg : args) {
			int height = Integer.parseInt(arg);
			if (height > highest) {
				high = higher;
			    higher = highest;
				highest = height;
			} else if (height > higher) {
				high = higher;
				higher = height;
			} else if (height > high) {
				high = height;
			}
		}
		System.out.println(highest);
		System.out.println(higher);
		System.out.println(high);
	}
}