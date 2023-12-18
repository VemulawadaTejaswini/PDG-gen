public class A {
	public static void main(String[] args) {

                        Scanner in = new Scanner(System.in);
			int[] poles = new int[3];
			for (int i = 0; i < 3; i++) {
				poles[i] = in.nextInt();
			}
			List<Integer> arrangement = new ArrayList<>();
			for (int i = 0; i < poles.length; i++) {
				for (int j = 0; j < poles.length; j++) {
					if (i < j) {
						arrangement.add(Math.abs(poles[i]-poles[j]));
					}
				}
			}
			boolean isBeautiful = false;
			for (int i = 0; i < arrangement.size(); i++) {
				for (int j = 1; j < arrangement.size(); j++) {
					if (arrangement.get(i).compareTo(arrangement.get(j)) == 0 && i != j) {
						isBeautiful = true;
					}
				}
			}
			
			System.out.println(isBeautiful);
}
}