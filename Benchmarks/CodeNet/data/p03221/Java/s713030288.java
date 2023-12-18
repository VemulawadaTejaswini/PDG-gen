import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MainB {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		int[][] arr = new int[m][4];
		for (int i = 0; i < m; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			arr[i][2] = i;
			
			sc.nextLine();
		}
		sort(arr,1);
		int[] count = new int[n+1];
		for(int i=0; i<m; i++){
			arr[i][3] = count[arr[i][0]]+1;
			count[arr[i][0]]++;
		}
		sort(arr,2);
		for(int i=0; i<m; i++){
			System.out.println(addZeroForNum(String.valueOf(arr[i][0])) + addZeroForNum(String.valueOf(arr[i][3])));
		}
	}

	public static void sort(int[][] ob, final int order) {
		Arrays.sort(ob, new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				int[] one = (int[]) o1;
				int[] two = (int[]) o2;
				if (one[order] > two[order]) {
					return 1;
				} else if (one[order] < two[order]) {
					return -1;
				} else {
					return 0;
				}
			}
		});
	}

	public static String addZeroForNum(String str) {
		int strLen = str.length();
		if (strLen < 6) {
			while (strLen < 6) {
				StringBuffer sb = new StringBuffer();
				sb.append("0").append(str);
				str = sb.toString();
				strLen = str.length();
			}
		}
		return str;
	}