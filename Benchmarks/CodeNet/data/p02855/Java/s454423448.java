import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		char[][] field = new char[h][];
		for (int i = 0; i < h; i++) {
		    field[i] = sc.next().toCharArray();
		}
		int[][] ans = new int[h][w];
		int count = 0;
		for (int i = 0; i < h; i++) {
		    int cnt = 0;
		    for (int j = 0; j < w; j++) {
		        if (field[i][j] == '#') {
		            cnt++;
		            break;
		        }
		    }
		    if (cnt == 0) {
		        continue;
		    }
		    count++;
		    int idx = 0;
		    while (idx < w) {
		        boolean flag = false;
		        while (idx < w) {
		            ans[i][idx] = count;
		            if (field[i][idx] == '#') {
		                flag = true;
		            }
		            if (idx + 1 >= w) {
		                idx++;
		                break;
		            } 
		            if (flag && field[i][idx + 1] == '#') {
		                count++;
		                idx++;
		                break;
		            }
		            idx++;
		        }
		    }
		}
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        if (ans[i][j] != 0) {
		            break;
		        }
		        int idx = 1;
		        while (i + idx < h && ans[i + idx][j] == 0) {
		            idx++;
		        }
		        if (i + idx < h) {
		            ans[i][j] = ans[i + idx][j];
		            continue;
		        }
		        idx = -1;
		        while (ans[i + idx][j] == 0) {
		            idx--;
		        }
	            ans[i][j] = ans[i + idx][j];
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < h; i++) {
		    for (int j = 0; j < w; j++) {
		        if (j != 0) {
		            sb.append(" ");
		        }
		        sb.append(ans[i][j]);
		    }
		    sb.append("\n");
		}
		System.out.print(sb);
   }
}

