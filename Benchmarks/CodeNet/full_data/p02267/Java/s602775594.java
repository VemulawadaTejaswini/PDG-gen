import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[4];
		for(int i = 0; i < str.length; i++) {
			str[i] = sc.nextLine();
		}
		sc.close();
		int lenSort = Integer.parseInt(str[0]);
		int[] sorted = stringToIntArray(str[1], lenSort);
		int lenUn = Integer.parseInt(str[2]);
		int[] unsorted = stringToIntArray(str[3], lenUn);
		int n = 0;
		for(int u: unsorted) {
			n += linearSearch(sorted, u);
		}
		System.out.println(n);
	}
	
	public static int[] stringToIntArray(String str, int len) {
		String[] strings = str.split(" ", len);
		int[] nums = new int[strings.length];
		for(int i = 0; i < strings.length; i++) {
			nums[i] = Integer.parseInt(strings[i]);
		}
		return nums;
	}
	
	public static int linearSearch(int[] sorted, int x) {
		int n = 0;
		for(int s: sorted) {
			if(x == s)
				n++;
		}
		if (n != 0) return 1;
		else return 0;
	}
}

