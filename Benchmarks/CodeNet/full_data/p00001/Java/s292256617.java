public class Main {
	public static void main(String[] a) {
		int[] Hills = { 1819, 2003, 876, 2840, 1723, 1673, 3776, 2848, 1592,
				922 };
		int no1 = 0;
		int no2 = 0;
		int no3 = 0;

		for (int i = 0; i < Hills.length; i++) {
			if ((0 < Hills[i]) & (Hills[i] < 10000)) {
				if (no1 < Hills[i]) {
					no3 = no2;
					no2 = no1;
					no1 = Hills[i];
				} else if (no2 < Hills[i]) {
					no3 = no2;
					no2 = Hills[i];
				} else if (no3 < Hills[i]) {
					no3 = Hills[i];
				}
			}
		}

		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
	}
}