public class Main {
	public static void main(String[] a) {
		short temp[] = new short[3];
		for (int i = 0; i < a.length; i++) {
			short num = Short.parseShort(a[i]);
			if (temp[0] < num) {
				temp[2] = temp[1];
				temp[1] = temp[0];
				temp[0] = num;
				continue;
			}
			if (temp[1] < num) {
				temp[2] = temp[1];
				temp[1] = num;
				continue;
			}
			if (temp[2] < num) {
				temp[2] = num;
				continue;
			}
		}
		for (short i = 0; i < 3; i++) {
			System.out.println(temp[i]);
		}
	}
}