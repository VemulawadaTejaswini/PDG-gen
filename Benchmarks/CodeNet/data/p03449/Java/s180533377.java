import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int i = 0;
		int[][] ar;
		ar = new int[2][];
		while (sc.hasNextLine()) {
		    String s = sc.nextLine();
		    String[] sr = s.split(" ");
		    int[] sri = new int[sr.length];
		    for(int j = 0; j<n ; j++) {
			    sri[j] = Integer.parseInt(sr[j]);
		    }
		    ar[i] = sri;
		    i++;
		}

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for(int ii = 0; ii < ar[0].length ; ii++) {
			int count = 0;
			for(int j = 0; j<ar[0].length ; j++) {
				if(ii == j) {
					count += ar[0][j] + ar[1][j];
				} else if (ii > j) {
					count += ar[0][j];
				} else if (ii < j) {
					count += ar[1][j];
				}
			}
			arrayList.add(count);
//			System.out.println(count);
		}

		int result = (Collections.max(arrayList)<0)? 0 : Collections.max(arrayList);
		// 出力
		System.out.println(result);
	}
}