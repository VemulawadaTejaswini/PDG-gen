public class AtCoder {

	public static void main(String[] args) {
		String[] weekdays = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		String S = "TUE";
		int index = 0;
		for (int i = 0; i < weekdays.length; i++) {
			if (weekdays[i].equals(S)) {
				index = i;
				break;
			}
		}
		System.out.println(7 - index);
	}

}