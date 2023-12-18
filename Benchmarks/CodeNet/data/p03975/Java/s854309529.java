package atcorder1610;

public class KUPC2016 {

	public static void main(String[] args) {

		String nab = "5 4 9";
		int[] t = { 5, 6, 7, 8, 9 };

		System.out.println(serch(nab, t));

	}

	public static int serch(String nab, int[] t) {

		String[] strArray = nab.split(" ");

		int i = 0;

		int[] num = new int[3];

		for (String str : strArray) {
			num[i] = Integer.parseInt(str);
			i++;
		}

		int ans = num[0];

		for (int j = 0; j < num[0]; j++) {
			if (num[1] <= t[j] && t[j] >= num[2]) {
				ans--;
			}
		}

		return ans;
	}

}