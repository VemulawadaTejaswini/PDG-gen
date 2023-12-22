import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		Scanner insert = new Scanner(System.in);
		int n = -1;
		int m = -1;
		while(true) {
			if((n==0) && (m==0)) {
				break;
			}
			String line = insert.nextLine();
			String array1[] = line.split(" ");
			n = Integer.parseInt(array1[0]);
			m = Integer.parseInt(array1[1]);
			int[] min = new int[n];
			int[] max = new int[n];
			int sum = 0;
			for(int i =0; i < m; i++) {
				String line2 = insert.nextLine();
				String array2[] = line2.split(" ");
				int s = Integer.parseInt(array2[0]);
				int ninzu = Integer.parseInt(array2[1]);
				sum+= s;
				if(ninzu == 1) {
					min[Integer.parseInt(array2[2]) - 1] +=s;
					max[Integer.parseInt(array2[2]) - 1] +=s;
				}
				else {
					for(int j = 0; j < ninzu; j++) {
						max[Integer.parseInt(array2[j+2]) - 1] +=s;
					}
				}
			}
			int minN =sum;
			int maxN = 0;
			int index = -1;
			for(int i =0;i < n; i++) {

				if(maxN < max[i]) {
					maxN = max[i];
					index = i;
				}
			}
			for(int i =0;i < n; i++) {

				if((i != index) && (minN > min[i])) {
					minN = min[i];
				}
			}
			result.add(maxN - minN +1);
		}
		for(int i = 0;i < (result.size() - 1);i++) {
			System.out.println(result.get(i));
		}

	}

}

