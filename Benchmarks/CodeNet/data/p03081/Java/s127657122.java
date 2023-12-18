import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String line = reader.readLine();
//		if (line.equals("A")) {
//			System.out.println("T");
//		}
//		else if (line.equals("T")) {
//			System.out.println("A");
//		}
//		else if (line.equals("C")) {
//			System.out.println("G");
//		}
//		else if (line.equals("G")) {
//			System.out.println("C");
//		}


//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String[] str = reader.readLine().split("");
//		StringBuilder s = new StringBuilder();
//		for (int i = 0; i < str.length; i++) {
//			if (str[i].equals("A") || str[i].equals("T") || str[i].equals("C") || str[i].equals("G")) {
//				s.append("p");
//			}
//			else {
//				s.append("n");
//			}
//		}
//		s.toString();
//		System.out.println(s);   ////////////////
//		int ans = 0;
//		for (int i = 1; i <= s.length(); i++) {
//			String regex = p{i};
//			System.out.println(regex);   ////////////////
//			Pattern p = Pattern.compile(regex);
//			Matcher m = p.matcher(s);
//			if (m.find()){
//				ans = i;
//			}
//		}
//		System.out.println(ans);
//		//if (("p")\1(s)) {


//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String[] str = reader.readLine().split("");
//		int[] count = new int[str.length + 1];
//		ArrayList<Integer> list = new ArrayList<>();
//		for (int i = 0; i < str.length; i++) {
//			if (str[i].equals("A") || str[i].equals("T") || str[i].equals("C") || str[i].equals("G")) {
//				count[i+1] = count[i] + 1;
//				if (i == str.length-1) {
//					list.add(count[i+1]);
//				}
//			}
//			else {
//				list.add(count[i]);
//			}
//		}
//		if (list.size() == 0) {
//			list.add(count[str.length]);
//		}
//		int max = Collections.max(list);
//		System.out.println(max);


//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String[] str = reader.readLine().split("");
//		int count = 0;
//		int max = 0;
//		for (int i = 0; i < str.length; i++) {
//			if (str[i].equals("A") || str[i].equals("T") || str[i].equals("C") || str[i].equals("G")) {
//				count++;
//				if (count > max) {
//					max = count;
//				}
//			}
//			else {
//				count = 0;
//			}
//		}
//		System.out.println(count);
		
		
		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String[] str = reader.readLine().split(" ");
//		int[] abc = new int[str.length];
//		for (int i = 0; i < 3; i++) {
//			abc[i]= Integer.parseInt(str[i]);
//		}
//		int max = 0;
//		int max_i = 0;
//		int min = 101;
//		int min_i = 0;
//		int mid = 0;
//		int mid_i = 0;
//		for (int i = 0; i < 3; i++) {
//			//boolean flag = false;
//			if (abc[i] > max) {
//				max = abc[i];
//				max_i = i;
//				//flag = true;
//			}
//			if (abc[i] < min) {
//				min = abc[i];
//				min_i = i;
//				//flag = true;
//			}
//			//if (!flag) {
//			//	mid = abc[i];
//			//}
//		}
//		if (max_i == 0 && min_i == 1) {
//			mid = abc[2];
//		}
//		else if (max_i == 0 && min_i == 2) {
//			mid = abc[1];
//		}
//		else if (max_i == 1 && min_i == 0) {
//			mid = abc[2];
//		}
//		else if (max_i == 1 && min_i == 2) {
//			mid = abc[0];
//		}
//		else if (max_i == 2 && min_i == 0) {
//			mid = abc[1];
//		}
//		else if (max_i == 2 && min_i == 1) {
//			mid = abc[0];
//		}
//		
//		if (max < min + mid) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
		
		
		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String[] str = reader.readLine().split(" ");
//		int[] abc = new int[str.length];
//		for (int i = 0; i < 3; i++) {
//			abc[i]= Integer.parseInt(str[i]);
//		}
//		if (abc[0] == abc[1] && abc[1] == abc[2]) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
		
		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		int N = Integer.parseInt(reader.readLine());
//		String[] rb = reader.readLine().split("");
//		int r_count = 0;
//		for (int i = 0; i < N; i++) {
//			if (rb[i].equals("R")) {
//				r_count++;
//			}
//		}
//		int b_count = N - r_count;
//		if (r_count > b_count) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
		
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int Q = Integer.parseInt(str[1]);
		char[] abc_keep = reader.readLine().toCharArray();     //charで一文字ずつ
		int ans = N;
		boolean[][] abc = new boolean[N][28];
		
		for (int k  =0; k < Q; k++) {
			char[] order = reader.readLine().toCharArray();
			int num2 = order[0] - 'A' + 1;
			for (int i = 0; i < N; i++) {
				int num = abc_keep[i] - 'A' + 1;
				abc[i][num] = true;
				if (num == num2) {
					if (order[2] == 'L') {
						if (i > 0) {
							abc[i-1][num] = true;
							abc[i][num] = false;
						}
						else {
							ans--;
							//System.out.println("abc_keep[" + i + "]=" + abc_keep[i]);   /////////////
						}
					}
					else {
						if (i < N-1) {
							abc[i+1][num] = true;
							abc[i][num] = false;
						}
						else {
							ans--;
							//System.out.println("abc_keep[" + i + "]=" + abc_keep[i]);   /////////////
						}
					}
				}
			}
		}
		System.out.println(ans);
		
		
		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String[] str = reader.readLine().split(" ");
//		int N = Integer.parseInt(str[0]);
//		int Q = Integer.parseInt(str[1]);
//		char[] abc = reader.readLine().toCharArray();     //charで一文字ずつ
//		int ans = 0;
//		for (int i = 0; i < N; i++) {
//			int i_keep = i;
//			for (int k  =0; k < Q; k++) {
//				char[] order = reader.readLine().toCharArray();
//				if (abc[i_keep] == order[0]) {
//					if (order[2] == 'L') {
//						if (i_keep > 0) {
//							i_keep--;
//						}
//						else {
//							break;
//						}
//					}
//					else {
//						if (i_keep < N-1) {
//							i_keep++;
//						}
//						else {
//							break;
//						}
//					}
//				}
//				if (k == Q-1) {
//					ans++;
//				}
//			}
//		}
//		System.out.println(ans);
	}
}