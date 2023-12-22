import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader( new InputStreamReader(System.in) );

		int H = Integer.parseInt(br.readLine());
		String[] data = br.readLine().split(" ");

		int[] A = new int[H+1];
		for (int i=0; i < H; i++) {
			A[i+1] = Integer.parseInt(data[i]);
		}

		StringBuilder sb = new StringBuilder();

		sb.append("node 1: key = " + A[1] + ", left key = "
				+ A[2] + ", right key = " +A[3] + ", \n");

		for (int id=2; id <= H; id++) {
			sb.append("node " + id +": key = " + A[id]);
			sb.append(", parent key = " + A[id/2]);
			if (id*2 <= H) sb.append(", left key = " + A[id*2]);
			if (id*2 +1 <= H) sb.append(", right key = " + A[id*2 + 1]);
			sb.append(", \n");
		}

		System.out.print(sb);
	}

}